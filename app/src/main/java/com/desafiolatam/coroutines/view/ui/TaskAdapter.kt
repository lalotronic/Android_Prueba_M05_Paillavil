package com.desafiolatam.coroutines.view.ui

import android.graphics.Paint
import android.text.TextPaint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.desafiolatam.coroutines.data.TaskEntity
import com.desafiolatam.coroutines.databinding.ItemTaskBinding

/*class TaskAdapter :
    RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    private lateinit var binding: ItemTaskBinding
    lateinit var taskList: List<TaskEntity>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        binding = ItemTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TaskViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.onBind(taskList[position])
    }

    override fun getItemCount(): Int = taskList.size

    inner class TaskViewHolder(binding: ItemTaskBinding) : ViewHolder(binding.root) {
        fun onBind(task: TaskEntity) {
            binding.run {
                tvTaskTitle.text = task.title
                tvTaskDescription.text = task.description
            }
        }
    }
}*/
/*
class TaskAdapter :
    RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    private lateinit var binding: ItemTaskBinding
    lateinit var taskList: List<TaskEntity>
    var onLongClick: ((TaskEntity) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        binding = ItemTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TaskViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.onBind(taskList[position])
    }

    override fun getItemCount(): Int = taskList.size

    inner class TaskViewHolder(private val binding: ItemTaskBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(task: TaskEntity) {
            binding.tvTaskTitle.text = task.title
            binding.tvTaskDescription.text = task.description
            binding.cbIsCompleted.isChecked = task.isCompleted

            // Configurar tachado si la tarea está completada
            binding.tvTaskTitle.paintFlags = if (task.isCompleted) {
                binding.tvTaskTitle.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            } else {
                binding.tvTaskTitle.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }

            // Long click para eliminar tarea
            binding.root.setOnLongClickListener {
                onLongClick?.invoke(task)
                true
            }

            // Cambia el estado de completado al hacer clic en el checkbox
            binding.cbIsCompleted.setOnClickListener {
                val updatedTask = task.copy(isCompleted = binding.cbIsCompleted.isChecked)
                onTaskCheckedChange?.invoke(updatedTask)  // Llama a onTaskCheckedChange
            }
        }
    }
}

*/









   /* inner class TaskViewHolder(binding: ItemTaskBinding) : ViewHolder(binding.root) {
        fun onBind(task: TaskEntity) {

         /*   binding.run {
                tvTaskTitle.text = task.title
                tvTaskDescription.text = task.description

                clItem.setOnClickListener {
                    onLongClick?.invoke(task)
                    true
                }
                cbIsCompleted.setOnClickListener {
                    // Aplicar el flag de tachado al TextView
                    tvTaskTitle.paintFlags = tvTaskTitle.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG

                    // Mostrar el Toast
                    Toast.makeText(binding.root.context, "borrar tarea", Toast.LENGTH_LONG).show()

                }


            }
        }
    }
}

*/

            fun onBind(task: TaskEntity) {
                binding.tvTaskTitle.text = task.title
                binding.tvTaskDescription.text = task.description
                binding.cbIsCompleted.isChecked = task.isCompleted

             /*   // Configurar tachado si la tarea está completada
                binding.tvTaskTitle.paintFlags = if (task.isCompleted) {
                    binding.tvTaskTitle.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                } else {
                    binding.tvTaskTitle.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
                }

                // Long click para eliminar tarea
                binding.root.setOnLongClickListener {
                    onLongClick?.invoke(task)
                    true
                }

                // Cambia el estado de completado al hacer clic en el checkbox
                binding.cbIsCompleted.setOnClickListener {
                    task.isCompleted = binding.cbIsCompleted.isChecked
                    onTaskCheckedChange?.invoke(task)  // Llama a onTaskCheckedChange
                }
            }
        }
    }











/*private fun CheckBox.setOnClickListener(action: () -> Unit) {
    this.setOnClickListener {
        action() // Llama a la acción proporcionada cuando se hace clic
    }*/

*/

                binding.tvTaskTitle.paintFlags = if (task.isCompleted) {
                    binding.tvTaskTitle.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                } else {
                    binding.tvTaskTitle.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
                }

                // Long click para eliminar tarea
                binding.root.setOnLongClickListener {
                    onLongClick?.invoke(task)
                    true
                }

                // Cambia el estado de completado al hacer clic en el checkbox
                binding.cbIsCompleted.setOnClickListener {
                    // Crear una copia de `task` con el estado `isCompleted` invertido
                    val updatedTask = task.copy(isCompleted = binding.cbIsCompleted.isChecked)
                    onTaskCheckedChange?.invoke(updatedTask)  // Llama a onTaskCheckedChange
                }
            }
        }
    }
*/
class TaskAdapter : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    private lateinit var binding: ItemTaskBinding
    lateinit var taskList: List<TaskEntity>

    var onLongClick: ((TaskEntity) -> Unit)? = null
    var onTaskCheckedChange: ((TaskEntity) -> Unit)? = null // Define aquí

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        binding = ItemTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TaskViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.onBind(taskList[position])
    }

    override fun getItemCount(): Int = taskList.size

    inner class TaskViewHolder(private val binding: ItemTaskBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(task: TaskEntity) {
            binding.tvTaskTitle.text = task.title
            binding.tvTaskDescription.text = task.description
            binding.cbIsCompleted.isChecked = task.isCompleted

            // Configurar tachado si la tarea está completada
            binding.tvTaskTitle.paintFlags = if (task.isCompleted) {
                binding.tvTaskTitle.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            } else {
                binding.tvTaskTitle.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }

            // Long click para eliminar tarea
            binding.root.setOnLongClickListener {
                onLongClick?.invoke(task)
                true
            }

            // Cambia el estado de completado al hacer clic en el checkbox
            binding.cbIsCompleted.setOnClickListener {
                // Llamar al callback cuando cambie el estado del checkbox
                val updatedTask = task.copy(isCompleted = binding.cbIsCompleted.isChecked)
                onTaskCheckedChange?.invoke(updatedTask) // Llama a onTaskCheckedChange
            }
        }
    }
}