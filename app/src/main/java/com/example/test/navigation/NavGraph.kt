package com.example.test.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.test.screen.MainView
import com.example.test.screen.module1.Module1View
import com.example.test.screen.module1.Module1ViewModel
import com.example.test.screen.module2.Module2View
import com.example.test.screen.shared_feature.SharedFeatureScreen
import com.example.test.screen.shared_feature.SharedFeatureViewModel

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        modifier = Modifier.fillMaxSize(),
        navController = navController,
        startDestination = NavRoute.MainScreen.path,
    ) {
        composable(route = NavRoute.MainScreen.path) {
            MainView(navigateToModule1 = {
                navController.navigate(NavRoute.Module1.createRoute())
            }, navigateToModule2 = {
                navController.navigate(NavRoute.Module2.createRoute())
            })
        }
        composable(route = NavRoute.Module1.path) {
            Module1View(navigateToSharedFeature = {
                navController.navigate(NavRoute.SharedFeature.createRoute())
            })
        }
        composable(route = NavRoute.Module2.path) {
            Module2View(navigateToSharedFeature = {
                navController.navigate(NavRoute.SharedFeature.createRoute())
            })
        }
        composable(route = NavRoute.SharedFeature.path) {
            val parentEntry = remember(it) {
                navController.previousBackStackEntry!!
            }
            // val parentViewModel: ModuleViewModel (interface) = hiltViewModel(parentEntry) - error
            // val parentViewModel: Module2ViewModel = hiltViewModel(parentEntry) - works
            val parentViewModel: Module1ViewModel = hiltViewModel(parentEntry)

            val childViewModel = hiltViewModel<SharedFeatureViewModel, SharedFeatureViewModel.Factory> { factory ->
                factory.create(parentViewModel.repository)
            }
            SharedFeatureScreen(childViewModel)
        }
    }
}