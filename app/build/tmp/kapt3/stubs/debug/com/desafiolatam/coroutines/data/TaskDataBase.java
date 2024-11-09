package com.desafiolatam.coroutines.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * NO MODIFICAR
 */
@androidx.room.Database(entities = {com.desafiolatam.coroutines.data.TaskEntity.class}, version = 2)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/desafiolatam/coroutines/data/TaskDataBase;", "Landroidx/room/RoomDatabase;", "()V", "taskDao", "Lcom/desafiolatam/coroutines/data/TaskDao;", "app_debug"})
public abstract class TaskDataBase extends androidx.room.RoomDatabase {
    
    public TaskDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.desafiolatam.coroutines.data.TaskDao taskDao();
}