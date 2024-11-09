package com.desafiolatam.coroutines.repository;

import com.desafiolatam.coroutines.data.TaskEntity;
import kotlinx.coroutines.flow.Flow;

/**
 * NO MODIFICAR
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/desafiolatam/coroutines/repository/TaskRepository;", "", "addTask", "", "task", "Lcom/desafiolatam/coroutines/data/TaskEntity;", "(Lcom/desafiolatam/coroutines/data/TaskEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTask", "getTasks", "Lkotlinx/coroutines/flow/Flow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isTaskCompleted", "isCompleted", "", "(Lcom/desafiolatam/coroutines/data/TaskEntity;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TaskRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTasks(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.desafiolatam.coroutines.data.TaskEntity>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addTask(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.data.TaskEntity task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.data.TaskEntity task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object isTaskCompleted(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.data.TaskEntity task, boolean isCompleted, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}