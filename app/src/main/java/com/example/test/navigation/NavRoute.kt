package com.example.test.navigation

sealed class NavRoute(val path: String) {

    data object MainScreen: NavRoute("main") {
        fun createRoute() : String {
            return "main"
        }
    }
    data object Module1: NavRoute("module1") {
        fun createRoute() : String {
            return "module1"
        }
    }
    data object Module2: NavRoute("module2") {
        fun createRoute() : String {
            return "module2"
        }
    }
    data object SharedFeature: NavRoute("sharedFeature") {
        fun createRoute() : String {
            return "sharedFeature"
        }
    }

}