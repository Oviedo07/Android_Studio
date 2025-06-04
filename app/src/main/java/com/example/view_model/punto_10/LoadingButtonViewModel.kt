package com.example.view_model.punto_10

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoadingButtonViewModel : ViewModel() {
    var isLoading by mutableStateOf(false)
        private set

    var isComplete by mutableStateOf(false)
        private set

    fun simulateLoading() {
        isLoading = true
        isComplete = false
        viewModelScope.launch {
            delay(2000)
            isLoading = false
            isComplete = true
        }
    }
}
