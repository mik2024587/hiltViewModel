package com.example.test.screen.module1

import androidx.lifecycle.ViewModel
import com.example.test.data.Module1RepositoryImpl
import com.example.test.data.Repository
import com.example.test.screen.ModuleViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Module1ViewModel @Inject constructor(): ViewModel(), ModuleViewModel {
    override val repository: Repository = Module1RepositoryImpl()
}