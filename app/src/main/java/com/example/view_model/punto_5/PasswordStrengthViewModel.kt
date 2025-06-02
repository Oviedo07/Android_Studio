package com.example.view_model.punto_5

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.compose.ui.graphics.Color

class PasswordStrengthViewModel : ViewModel() {
    var password by mutableStateOf("")
        private set

    var strength by mutableStateOf("Débil")
        private set

    var strengthColor by mutableStateOf(Color.Red)
        private set

    fun onPasswordChange(input: String) {
        password = input
        evaluateStrength(input)
    }

    private fun evaluateStrength(pass: String) {
        when {
            pass.length < 6 -> {
                strength = "Débil"
                strengthColor = Color.Red
            }
            pass.length < 10 -> {
                strength = "Media"
                strengthColor = Color(0xFFFFA500) // Amarillo/naranja
            }
            else -> {
                strength = "Fuerte"
                strengthColor = Color(0xFF4CAF50) // Verde
            }
        }
    }
}
