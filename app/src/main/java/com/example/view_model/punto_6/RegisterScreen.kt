package com.example.view_model.punto_6

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun RegisterScreen(viewModel: RegisterViewModel = viewModel()) {

    fun borderColor(showError: Boolean): Color {
        return if (showError) Color.Red else Color.Gray
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = viewModel.name,
            onValueChange = { viewModel.name = it },
            label = { Text("Nombre") },
            isError = viewModel.nameError,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = borderColor(viewModel.nameError),
                unfocusedBorderColor = borderColor(viewModel.nameError)
            ),
            modifier = Modifier.fillMaxWidth()
        )
        if (viewModel.nameError) Text("El nombre no puede estar vacío", color = Color.Red)

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = viewModel.email,
            onValueChange = { viewModel.email = it },
            label = { Text("Correo") },
            isError = viewModel.emailError,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = borderColor(viewModel.emailError),
                unfocusedBorderColor = borderColor(viewModel.emailError)
            ),
            modifier = Modifier.fillMaxWidth()
        )
        if (viewModel.emailError) Text("Correo inválido", color = Color.Red)

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = viewModel.password,
            onValueChange = { viewModel.password = it },
            label = { Text("Contraseña") },
            isError = viewModel.passwordError,
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = borderColor(viewModel.passwordError),
                unfocusedBorderColor = borderColor(viewModel.passwordError)
            ),
            modifier = Modifier.fillMaxWidth()
        )
        if (viewModel.passwordError) Text("Debe tener al menos 6 caracteres", color = Color.Red)

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = viewModel.confirmPassword,
            onValueChange = { viewModel.confirmPassword = it },
            label = { Text("Confirmar contraseña") },
            isError = viewModel.confirmPasswordError,
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = borderColor(viewModel.confirmPasswordError),
                unfocusedBorderColor = borderColor(viewModel.confirmPasswordError)
            ),
            modifier = Modifier.fillMaxWidth()
        )
        if (viewModel.confirmPasswordError) Text("Las contraseñas no coinciden", color = Color.Red)

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { viewModel.validateAll() },
            enabled = viewModel.isFormValid,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Registrarse")
        }
    }
}

private fun TextFieldDefaults.outlinedTextFieldColors(
    focusedBorderColor: Color,
    unfocusedBorderColor: Color
): TextFieldColors {
    return TODO("Provide the return value")
}
