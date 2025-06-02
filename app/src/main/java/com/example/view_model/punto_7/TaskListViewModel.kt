package com.example.view_model.punto_7

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class TaskListViewModel : ViewModel() {
    var tasks by mutableStateOf(
        listOf(
            Task(1, "Estudiar Compose"),
            Task(2, "Hacer ejercicio"),
            Task(3, "Leer 20 minutos")
        )
    )
        private set

    fun toggleTaskStatus(taskId: Int) {
        tasks = tasks.map {
            if (it.id == taskId) it.copy(isDone = !it.isDone) else it
        }
    }
}
