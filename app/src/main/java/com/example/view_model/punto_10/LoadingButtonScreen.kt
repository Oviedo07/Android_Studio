package com.example.view_model.punto_10

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun LoadingButtonScreen(viewModel: LoadingButtonViewModel = viewModel()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { viewModel.simulateLoading() },
            enabled = !viewModel.isLoading,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                when {
                    viewModel.isLoading -> "Cargando..."
                    viewModel.isComplete -> "Listo"
                    else -> "Enviar"
                }
            )
        }
    }
}
