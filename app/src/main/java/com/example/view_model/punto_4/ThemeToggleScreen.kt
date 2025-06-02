package com.example.view_model.punto_4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ThemeToggleScreen(viewModel: ThemeViewModel = viewModel()) {
    val backgroundColor = if (viewModel.isDarkTheme) Color(0xFF121212) else Color(0xFFFFFFFF)
    val textColor = if (viewModel.isDarkTheme) Color.White else Color.Black

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = if (viewModel.isDarkTheme) "Modo Oscuro" else "Modo Claro",
                color = textColor,

            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { viewModel.toggleTheme() }) {
                Text("Cambiar Tema")
            }
        }
    }
}
