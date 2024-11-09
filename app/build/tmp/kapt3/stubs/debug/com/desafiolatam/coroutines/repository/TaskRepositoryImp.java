package com.desafiolatam.coroutines.repository;

import com.desafiolatam.coroutines.data.TaskDao;
import com.desafiolatam.coroutines.data.TaskEntity;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

/**
 * NO MODIFICAR
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/desafiolatam/coroutines/repository/TaskRepositoryImp;", "Lcom/desafiolatam/coroutines/repository/TaskRepository;", "taskDao", "Lcom/desafiolatam/coroutines/data/TaskDao;", "(Lcom/desafiolatam/coroutines/data/TaskDao;)V", "addTask", "", "task", "Lcom/desafiolatam/coroutines/data/TaskEntity;", "(Lcom/desafiolatam/coroutines/data/TaskEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTask", "getTasks", "Lkotlinx/coroutines/flow/Flow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isTaskCompleted", "isCompleted", "", "(Lcom/desafiolatam/coroutines/data/TaskEntity;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TaskRepositoryImp implements com.desafiolatam.coroutines.repository.TaskRepository {
    private final com.desafiolatam.coroutines.data.TaskDao taskDao = null;
    
    @javax.inject.Inject
    public TaskRepositoryImp(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.data.TaskDao taskDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getTasks(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.desafiolatam.coroutines.data.TaskEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addTask(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.data.TaskEntity task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.data.TaskEntity task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object isTaskCompleted(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.data.TaskEntity task, boolean isCompleted, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}