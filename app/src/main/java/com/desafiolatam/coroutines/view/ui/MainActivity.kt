package com.desafiolatam.coroutines.view.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.desafiolatam.coroutines.R
import com.desafiolatam.coroutines.data.TaskEntity
import com.desafiolatam.coroutines.databinding.ActivityMainBinding
import com.desafiolatam.coroutines.view.TaskViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject
import androidx.activity.result.contract.ActivityResultContracts

@AndroidEntryPoint
/*class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val viewModel: TaskViewModel by viewModels()

    @Inject
    lateinit var adapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getTaskList()
    }

    private fun getTaskList() {
        lifecycleScope.launchWhenResumed {
            viewModel.taskListStateFlow.collectLatest {
                initRecyclerView(it)
            }
        }
    }

    private fun initRecyclerView(taskList: List<TaskEntity>) {
        adapter = TaskAdapter()
        adapter.taskList = taskList
        binding.rvTask.layoutManager = LinearLayoutManager(this)
        binding.rvTask.adapter = adapter
    }
}*/

/*class MainActivity : AppCompatActivity(),Fab,OnClickListener {

    lateinit var binding: ActivityMainBinding
    private val viewModel: TaskViewModel by viewModels()


    @Inject
    lateinit var adapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clAddTask.setOnClickListener(this)

        getTaskList()
    }

    private fun getTaskList() {
        lifecycleScope.launchWhenResumed {
            viewModel.taskListStateFlow.collectLatest {
                initRecyclerView(it)
            }
        }
    }

    /* private fun initRecyclerView(taskList: List<TaskEntity>) {
        adapter = TaskAdapter()
        adapter.taskList = taskList
        binding.rvTask.layoutManager = LinearLayoutManager(this)
        binding.rvTask.adapter = adapter
        //vamos con la eliminacion
        adapter.onLongClick = {
            Toast.makeText(this, "borrar tarea", Toast.LENGTH_LONG).show()
            borrar(it)

        }
    }

    private fun borrar(it: TaskEntity) {
        lifecycleScope.launch(Dispatchers.IO) {
            viewModel.deleteTask(it)
        }

    }


    override fun onClick(view: View) {
        when (view.id){
            R.id.cl_add_task  -> startActivity(Intent(this,NewTaskActivity::class.java))
        }
    }
}
*/
    /* private fun initRecyclerView(taskList: List<TaskEntity>) {
       adapter = TaskAdapter()
       adapter.taskList = taskList
       binding.rvTask.layoutManager = LinearLayoutManager(this)
       binding.rvTask.adapter = adapter

       // Long press para eliminar la tarea
       adapter.onLongClick = {
           Toast.makeText(this, "Borrar tarea", Toast.LENGTH_LONG).show()
           borrar(it)
       }

       // Cuando cambie el estado del checkbox de completado
       adapter.onTaskCheckedChange = { task ->
           viewModel.markTaskAsCompleted(task)
       }
   }*/

    /**  private fun initRecyclerView(taskList: List<TaskEntity>) {
    adapter = TaskAdapter()
    adapter.taskList = taskList
    binding.rvTask.layoutManager = LinearLayoutManager(this)
    binding.rvTask.adapter = adapter

    // Long press para eliminar la tarea
    adapter.onLongClick = {
    Toast.makeText(this, "Borrar tarea", Toast.LENGTH_LONG).show()
    borrar(it) // Llama a la función para eliminar la tarea
    }

    // Cuando cambie el estado del checkbox de completado
    adapter.onTaskCheckedChange = { task ->
    viewModel.markTaskAsCompleted(task) // Llama a la función para actualizar el estado en el ViewModel
    }
    }

    private fun borrar(task: TaskEntity) {
    lifecycleScope.launch {
    viewModel.deleteTask(task)
    }
    }
    }
     */

    private fun initRecyclerView(taskList: List<TaskEntity>) {
        adapter = TaskAdapter()
        adapter.taskList = taskList
        binding.rvTask.layoutManager = LinearLayoutManager(this)
        binding.rvTask.adapter = adapter

        // Long press para eliminar la tarea
        adapter.onLongClick = {
            Toast.makeText(this, "Borrar tarea", Toast.LENGTH_LONG).show()
            borrar(it) // Llama a la función para eliminar la tarea
        }

        // Cuando cambie el estado del checkbox de completado
        adapter.onTaskCheckedChange = { task ->
            viewModel.markTaskAsCompleted(task) // Llama a la función para actualizar el estado en el ViewModel
        }

    }
    private fun borrar(task: TaskEntity) {
        // Ejecutar la eliminación en el hilo de IO para operaciones de base de datos
        lifecycleScope.launch(Dispatchers.IO) {
            viewModel.deleteTask(task)
        }
    }
}
*/

    class MainActivity : AppCompatActivity() ,Fab,OnClickListener{

    private lateinit var binding: ActivityMainBinding
    private val viewModel: TaskViewModel by viewModels()



    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.cl_add_task -> startActivity(Intent(this, NewTaskActivity::class.java))
        }
    }



    @Inject
    lateinit var adapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clAddTask.setOnClickListener {
            startActivity(Intent(this, NewTaskActivity::class.java))
        }

        getTaskList()
    }

    private fun getTaskList() {
        lifecycleScope.launchWhenResumed {
            viewModel.taskListStateFlow.collectLatest {
                initRecyclerView(it)
            }
        }
    }

    private fun initRecyclerView(taskList: List<TaskEntity>) {
        adapter = TaskAdapter()
        adapter.taskList = taskList
        binding.rvTask.layoutManager = LinearLayoutManager(this)
        binding.rvTask.adapter = adapter

        // Long press para eliminar la tarea
        adapter.onLongClick = {
            Toast.makeText(this, "Borrar tarea", Toast.LENGTH_LONG).show()
            borrar(it) // Llama a la función para eliminar la tarea
        }

        // Cuando cambie el estado del checkbox de completado
        adapter.onTaskCheckedChange = { task ->
            lifecycleScope.launch(Dispatchers.IO) {
                viewModel.addTask(task)
            }
        }
    }

    private fun borrar(task: TaskEntity) {
        lifecycleScope.launch(Dispatchers.IO) {
            viewModel.deleteTask(task)
        }
    }
}


/*
class MainActivity : AppCompatActivity(),Fab,OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: TaskViewModel by viewModels()

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.cl_add_task -> startActivity(Intent(this, NewTaskActivity::class.java))
        }
    }


   /*
    @Inject
    lateinit var adapter: TaskAdapter

    companion object {
        const val NEW_TASK_REQUEST_CODE = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configuración para abrir NewTaskActivity
        binding.clAddTask.setOnClickListener {
            val intent = Intent(this, NewTaskActivity::class.java)
            startActivityForResult(intent, NEW_TASK_REQUEST_CODE)
        }

        getTaskList()
    }

    private fun getTaskList() {
        lifecycleScope.launchWhenResumed {
            viewModel.taskListStateFlow.collectLatest {
                initRecyclerView(it)
            }
        }
    }

    private fun initRecyclerView(taskList: List<TaskEntity>) {
        adapter = TaskAdapter()
        adapter.taskList = taskList
        binding.rvTask.layoutManager = LinearLayoutManager(this)
        binding.rvTask.adapter = adapter

        // Long press para eliminar la tarea
        adapter.onLongClick = {
            Toast.makeText(this, "Borrar tarea", Toast.LENGTH_LONG).show()
            borrar(it) // Llama a la función para eliminar la tarea
        }

        // Cuando cambie el estado del checkbox de completado
        adapter.onTaskCheckedChange = { task ->
            viewModel.markTaskAsCompleted(task)
        }
    }

    private fun borrar(task: TaskEntity) {
        lifecycleScope.launch(Dispatchers.IO) {
            viewModel.deleteTask(task)
        }
    }

    // Recibe el resultado de NewTaskActivity
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == NEW_TASK_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            val title = data?.getStringExtra("TASK_TITLE") ?: ""
            val description = data?.getStringExtra("TASK_DESCRIPTION") ?: ""

            // Crear la nueva tarea
            val newTask = TaskEntity(title = title, description = description, isCompleted = false)

            // Agregar la tarea al ViewModel
            lifecycleScope.launch {
                viewModel.addTask(newTask)
            }
        }
    }
}
*/


  /*  @Inject
    lateinit var adapter: TaskAdapter

    companion object {
        const val NEW_TASK_REQUEST_CODE = 1
    }

    // Nueva forma de manejar el resultado de una actividad
    private val newTaskLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data = result.data
            val title = data?.getStringExtra("TASK_TITLE") ?: ""
            val description = data?.getStringExtra("TASK_DESCRIPTION") ?: ""

            // Crear la nueva tarea
            val newTask = TaskEntity(title = title, description = description, isCompleted = false) // Elimina `isCompleted` si no existe

            // Agregar la tarea al ViewModel
            lifecycleScope.launch {
                viewModel.addTask(newTask)
            }
        }
    }

    private fun TaskEntity(title: String, description: String, isCompleted: Boolean): TaskEntity {
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configuración para abrir NewTaskActivity
        binding.clAddTask.setOnClickListener {
            val intent = Intent(this, NewTaskActivity::class.java)
            newTaskLauncher.launch(intent) // Llamada usando el nuevo launcher
        }

        getTaskList()
    }

    private fun getTaskList() {
        lifecycleScope.launchWhenResumed {
            viewModel.taskListStateFlow.collectLatest {
                initRecyclerView(it)
            }
        }
    }

    private fun initRecyclerView(taskList: List<TaskEntity>) {
        adapter = TaskAdapter()
        adapter.taskList = taskList
        binding.rvTask.layoutManager = LinearLayoutManager(this)
        binding.rvTask.adapter = adapter

        // Long press para eliminar la tarea
        adapter.onLongClick = {
            Toast.makeText(this, "Borrar tarea", Toast.LENGTH_LONG).show()
            borrar(it) // Llama a la función para eliminar la tarea
        }

        // Cuando cambie el estado del checkbox de completado
        adapter.onTaskCheckedChange = { task ->
            viewModel.markTaskAsCompleted(task)
        }
    }

    private fun borrar(task: TaskEntity) {
        lifecycleScope.launch(Dispatchers.IO) {
            viewModel.deleteTask(task)
        }
    }
}
*/