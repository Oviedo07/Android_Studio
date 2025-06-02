package com.example.view_model.punto_8

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class TextLimitViewModel : ViewModel() {
    var inputText by mutableStateOf("")
        private set

    fun onTextChange(newText: String) {
        inputText = newText
    }

    val charCount: Int
        get() = inputText.length

    val isOverLimit: Boolean
        get() = charCount > 100
}
