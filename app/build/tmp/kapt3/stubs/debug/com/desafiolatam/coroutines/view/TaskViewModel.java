package com.desafiolatam.coroutines.view;

import androidx.lifecycle.ViewModel;
import com.desafiolatam.coroutines.data.TaskEntity;
import com.desafiolatam.coroutines.repository.TaskRepositoryImp;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u0014\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/desafiolatam/coroutines/view/TaskViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/desafiolatam/coroutines/repository/TaskRepositoryImp;", "(Lcom/desafiolatam/coroutines/repository/TaskRepositoryImp;)V", "_data", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/desafiolatam/coroutines/data/TaskEntity;", "dispatcherIO", "Lkotlinx/coroutines/CoroutineDispatcher;", "taskListStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getTaskListStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "addTask", "", "task", "(Lcom/desafiolatam/coroutines/data/TaskEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTask", "loadTasks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markTaskAsCompleted", "app_debug"})
public final class TaskViewModel extends androidx.lifecycle.ViewModel {
    private final com.desafiolatam.coroutines.repository.TaskRepositoryImp repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.desafiolatam.coroutines.data.TaskEntity>> _data = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.desafiolatam.coroutines.data.TaskEntity>> taskListStateFlow = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcherIO = null;
    
    @javax.inject.Inject
    public TaskViewModel(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.repository.TaskRepositoryImp repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.desafiolatam.coroutines.data.TaskEntity>> getTaskListStateFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addTask(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.data.TaskEntity task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.data.TaskEntity task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void markTaskAsCompleted(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.data.TaskEntity task) {
    }
    
    private final java.lang.Object loadTasks(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}