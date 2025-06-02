package com.example.view_model.punto_3

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
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
fun PhoneScreen(viewModel: PhoneViewModel = viewModel()) {
    val borderColor = when (viewModel.isValid) {
        true -> Color.Green
        false -> Color.Red
        null -> Color.Gray
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = viewModel.phoneNumber,
            onValueChange = { viewModel.onPhoneChange(it) },
            label = { Text("Número de teléfono") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = borderColor,
                unfocusedBorderColor = borderColor,
                cursorColor = borderColor
            ),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { viewModel.validatePhone() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Validar")
        }

        if (viewModel.isValid == false) {
            Text(
                text = "Número inválido. Debe tener 10 dígitos.",
                color = Color.Red,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

private fun TextFieldDefaults.outlinedTextFieldColors(
    focusedBorderColor: Color,
    unfocusedBorderColor: Color,
    cursorColor: Color
): TextFieldColors {
    return TODO("Provide the return value")
}
