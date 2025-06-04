package com.example.view_model.punto_9

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class EmailValidationViewModel : ViewModel() {
    var email by mutableStateOf("")
        private set

    fun onEmailChange(newEmail: String) {
        email = newEmail
    }

    val isValid: Boolean
        get() = android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
}
