package com.desafiolatam.coroutines.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import kotlinx.coroutines.flow.Flow;

/**
 * NO MODIFICAR
 */
@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fH\'J!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/desafiolatam/coroutines/data/TaskDao;", "", "addTask", "", "taskEntity", "Lcom/desafiolatam/coroutines/data/TaskEntity;", "(Lcom/desafiolatam/coroutines/data/TaskEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTask", "taskId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTasks", "Lkotlinx/coroutines/flow/Flow;", "", "taskCompleted", "isCompleted", "", "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TaskDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM task")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.desafiolatam.coroutines.data.TaskEntity>> getTasks();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object addTask(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.data.TaskEntity taskEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM task WHERE id= :taskId")
    public abstract java.lang.Object deleteTask(int taskId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "UPDATE task SET isCompleted= :isCompleted WHERE id= :taskId")
    public abstract java.lang.Object taskCompleted(boolean isCompleted, int taskId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}