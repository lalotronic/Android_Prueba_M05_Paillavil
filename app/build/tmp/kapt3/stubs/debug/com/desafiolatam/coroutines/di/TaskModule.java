package com.desafiolatam.coroutines.di;

import android.content.Context;
import androidx.room.Room;
import com.desafiolatam.coroutines.data.TaskDao;
import com.desafiolatam.coroutines.data.TaskDataBase;
import com.desafiolatam.coroutines.view.ui.TaskAdapter;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

/**
 * NO MODIFICAR
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/desafiolatam/coroutines/di/TaskModule;", "", "()V", "provideAdapter", "Lcom/desafiolatam/coroutines/view/ui/TaskAdapter;", "provideTaskDao", "Lcom/desafiolatam/coroutines/data/TaskDao;", "db", "Lcom/desafiolatam/coroutines/data/TaskDataBase;", "provideTaskDataBase", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module
public final class TaskModule {
    @org.jetbrains.annotations.NotNull
    public static final com.desafiolatam.coroutines.di.TaskModule INSTANCE = null;
    
    private TaskModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.desafiolatam.coroutines.data.TaskDataBase provideTaskDataBase(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.desafiolatam.coroutines.data.TaskDao provideTaskDao(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.data.TaskDataBase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.desafiolatam.coroutines.view.ui.TaskAdapter provideAdapter() {
        return null;
    }
}