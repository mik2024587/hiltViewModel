package com.example.test.screen.shared_feature

import androidx.lifecycle.ViewModel
import com.example.test.data.Repository
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel(assistedFactory = SharedFeatureViewModel.Factory::class)
class SharedFeatureViewModel @AssistedInject constructor(@Assisted private val repository: Repository) : ViewModel() {

    fun get() : String {
        return repository.get()
    }

    @AssistedFactory
    interface Factory {
        fun create(repository: Repository): SharedFeatureViewModel
    }

}