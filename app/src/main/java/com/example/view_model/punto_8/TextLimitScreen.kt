package com.example.view_model.punto_8

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun TextLimitScreen(viewModel: TextLimitViewModel = viewModel()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = viewModel.inputText,
            onValueChange = { viewModel.onTextChange(it) },
            label = { Text("Escribe tu mensaje") },
            modifier = Modifier.fillMaxWidth(),
            maxLines = 4
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "${viewModel.charCount}/100",
            color = if (viewModel.isOverLimit) Color.Red else Color.Gray
        )
    }
}
