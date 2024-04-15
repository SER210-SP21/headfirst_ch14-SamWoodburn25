package edu.quinnipiac.ser210.tasks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class TaskViewModelFactory(private val dao: TaskDAO): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(TasksViewModel::class.java)){
            return TasksViewModel(dao) as T
        }
        throw IllegalArgumentException("Unknown view model.")
    }
}