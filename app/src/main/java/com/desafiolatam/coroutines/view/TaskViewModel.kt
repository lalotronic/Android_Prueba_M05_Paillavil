package com.desafiolatam.coroutines.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.desafiolatam.coroutines.data.TaskEntity
import com.desafiolatam.coroutines.repository.TaskRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
/*class TaskViewModel @Inject constructor(
    private val repository: TaskRepositoryImp
) : ViewModel() {

    private val _data: MutableStateFlow<List<TaskEntity>> = MutableStateFlow(emptyList())
    val taskListStateFlow: StateFlow<List<TaskEntity>> = _data.asStateFlow()

    init {
        viewModelScope.launch {
            repository.getTasks().collectLatest {
                _data.value = it
            }
        }
    }
} */

class TaskViewModel @Inject constructor(
    private val repository: TaskRepositoryImp
) : ViewModel() {

    private val _data: MutableStateFlow<List<TaskEntity>> = MutableStateFlow(emptyList())
    val taskListStateFlow: StateFlow<List<TaskEntity>> = _data.asStateFlow()
    private val dispatcherIO : CoroutineDispatcher = Dispatchers.IO

  /*  init {
        viewModelScope.launch {
            repository.getTasks().collectLatest {
                _data.value = it


            }
        }

    }
    suspend fun addTask(task: TaskEntity) {
        viewModelScope.launch(dispatcherIO) {
            repository.addTask(task)
        }
    }
    suspend fun deleteTask(task: TaskEntity) {
        viewModelScope.launch(dispatcherIO) {
            repository.deleteTask(task)
        }
    }


    }

}*/

    init {
        viewModelScope.launch {
            repository.getTasks().collectLatest {
                _data.value = it
            }
        }
    }

    // Función para agregar una nueva tarea
    suspend fun addTask(task: TaskEntity) {
        viewModelScope.launch(dispatcherIO) {
            repository.addTask(task)
            // Volver a cargar la lista después de agregar
            loadTasks()
        }
    }

    // Función para borrar una tarea
    suspend fun deleteTask(task: TaskEntity) {
        viewModelScope.launch(dispatcherIO) {
            repository.deleteTask(task)
            // Volver a cargar la lista después de borrar
            loadTasks()
        }
    }

    // Nueva función para marcar una tarea como completada
    fun markTaskAsCompleted(task: TaskEntity) {
        _data.value = _data.value.map {
            if (it.id == task.id) it.copy(isCompleted = !it.isCompleted) else it
        }
    }

    // Función para recargar las tareas
    private suspend fun loadTasks() {
        viewModelScope.launch(dispatcherIO) {
            repository.getTasks().collectLatest {
                _data.value = it
            }
        }
    }
}