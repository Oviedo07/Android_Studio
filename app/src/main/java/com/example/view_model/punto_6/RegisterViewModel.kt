package com.example.view_model.punto_6

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.compose.ui.graphics.Color

class RegisterViewModel : ViewModel() {
    var name by mutableStateOf("")
    var email by mutableStateOf("")
    var password by mutableStateOf("")
    var confirmPassword by mutableStateOf("")

    var nameError by mutableStateOf(false)
    var emailError by mutableStateOf(false)
    var passwordError by mutableStateOf(false)
    var confirmPasswordError by mutableStateOf(false)

    fun validateAll(): Boolean {
        nameError = name.isBlank()
        emailError = !email.contains("@") || !email.contains(".com")
        passwordError = password.length < 6
        confirmPasswordError = confirmPassword != password

        return !(nameError || emailError || passwordError || confirmPasswordError)
    }

    val isFormValid: Boolean
        get() = name.isNotBlank()
                && email.contains("@") && email.contains(".com")
                && password.length >= 6
                && confirmPassword == password
}
