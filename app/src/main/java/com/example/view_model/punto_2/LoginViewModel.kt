package com.example.view_model.punto_2

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    var email by mutableStateOf("")
    var password by mutableStateOf("")
    var emailError by mutableStateOf<String?>(null)
    var passwordError by mutableStateOf<String?>(null)

    val isFormValid: Boolean
        get() = emailError == null && passwordError == null && email.isNotBlank() && password.isNotBlank()

    fun onEmailChange(newEmail: String) {
        email = newEmail
        emailError = when {
            newEmail.isBlank() -> "El correo no puede estar vacío"
            !newEmail.contains("@") || !newEmail.contains(".com") -> "Correo inválido"
            else -> null
        }
    }

    fun onPasswordChange(newPassword: String) {
        password = newPassword
        passwordError = when {
            newPassword.isBlank() -> "La contraseña no puede estar vacía"
            newPassword.length < 6 -> "Debe tener al menos 6 caracteres"
            else -> null
        }
    }
}
