package com.example.view_model.punto_5

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun PasswordStrengthScreen(viewModel: PasswordStrengthViewModel = viewModel()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = viewModel.password,
            onValueChange = { viewModel.onPasswordChange(it) },
            label = { Text("Contraseña") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Fortaleza: ${viewModel.strength}",
            color = viewModel.strengthColor,
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Opcional: barra visual
        LinearProgressIndicator(
            progress = when (viewModel.strength) {
                "Débil" -> 0.3f
                "Media" -> 0.6f
                "Fuerte" -> 1f
                else -> 0f
            },
            color = viewModel.strengthColor,
            modifier = Modifier
                .fillMaxWidth()
                .height(6.dp)
        )
    }
}
