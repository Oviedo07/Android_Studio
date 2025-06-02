package com.example.view_model.punto_3

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class PhoneViewModel : ViewModel() {
    var phoneNumber by mutableStateOf("")
    var isValid by mutableStateOf<Boolean?>(null)

    fun onPhoneChange(input: String) {
        // Filtrar solo números
        phoneNumber = input.filter { it.isDigit() }
        isValid = null // Resetear validación visual al escribir
    }

    fun validatePhone() {
        isValid = phoneNumber.length == 10
    }
}
