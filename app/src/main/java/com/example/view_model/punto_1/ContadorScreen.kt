package com.example.view_model.punto_1

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ContadorScreen(viewModel: ContadorViewModel = viewModel()) {
    val contador by viewModel.contador.collectAsState()

    val color = if (contador % 2 == 0) Color.Green else Color.Red

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "$contador",
            style = MaterialTheme.typography.displayLarge,
            color = color
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row {
            Button(onClick = { viewModel.decrementar() }) {
                Text(text = "-")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { viewModel.incrementar() }) {
                Text(text = "+")
            }
        }
    }
}
