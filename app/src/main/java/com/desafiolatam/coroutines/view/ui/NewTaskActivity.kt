package com.desafiolatam.coroutines.view.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.desafiolatam.coroutines.R
import com.desafiolatam.coroutines.data.TaskEntity
import com.desafiolatam.coroutines.databinding.ActivityNewTaskBinding
import com.desafiolatam.coroutines.view.TaskViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
/*class NewTaskActivity : AppCompatActivity() {

    lateinit var binding: ActivityNewTaskBinding
    private val viewModel: TaskViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
*/
/*
 class NewTaskActivity : AppCompatActivity() {

    lateinit var binding: ActivityNewTaskBinding
    private val viewModel: TaskViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.save.setOnClickListener{
            agregarTarea()
        }

    }

    private fun agregarTarea() {
        var task : TaskEntity = TaskEntity(0,"title","cualquiercosa")
        //llamando a couroutine
        lifecycleScope.launch(Dispatchers.IO) {
        viewModel.addTask(task)
    }
        Toast.makeText(this, "Agregando tarea", Toast.LENGTH_LONG).show()
        startActivity(Intent(this,MainActivity::class.java))
    }


}

 */



class NewTaskActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewTaskBinding
    private val viewModel: TaskViewModel by viewModels() // Inicializa el ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.save.setOnClickListener {
            agregarTarea()
        }
    }

    private fun agregarTarea() {
        // Obtener el texto del campo de título
        val title = binding.title.text.toString().trim()
        // Obtener el texto del campo de descripción
        val description = binding.description.text.toString().trim() // Nueva línea para obtener la descripción

        // Validar que el título no esté vacío
        if (title.isEmpty()) {
            Toast.makeText(this, "El título no puede estar vacío", Toast.LENGTH_SHORT).show()
            return
        }

        // Crear la tarea con el título y la descripción ingresados
        val task = TaskEntity(0, title, description,false) // Usar la descripción aquí

        // Llamando a la coroutine para agregar la tarea
        lifecycleScope.launch(Dispatchers.IO) {
            viewModel.addTask(task) // Llama al método del ViewModel para agregar la tarea
            withContext(Dispatchers.Main) {
                Toast.makeText(this@NewTaskActivity, "Tarea agregada", Toast.LENGTH_LONG).show()
                startActivity(
                    Intent(
                        this@NewTaskActivity,
                        MainActivity::class.java
                    )
                ) // Navegar a MainActivity
                finish() // Finaliza esta actividad
            }
        }
    }
}