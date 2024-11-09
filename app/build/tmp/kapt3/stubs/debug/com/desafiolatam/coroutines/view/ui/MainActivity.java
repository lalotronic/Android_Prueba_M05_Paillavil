package com.desafiolatam.coroutines.view.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.desafiolatam.coroutines.R;
import com.desafiolatam.coroutines.data.TaskEntity;
import com.desafiolatam.coroutines.databinding.ActivityMainBinding;
import com.desafiolatam.coroutines.view.TaskViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;
import androidx.activity.result.contract.ActivityResultContracts;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0016\u0010\u0018\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006!"}, d2 = {"Lcom/desafiolatam/coroutines/view/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/desafiolatam/coroutines/view/ui/Fab;", "Landroid/view/View$OnClickListener;", "()V", "adapter", "Lcom/desafiolatam/coroutines/view/ui/TaskAdapter;", "getAdapter", "()Lcom/desafiolatam/coroutines/view/ui/TaskAdapter;", "setAdapter", "(Lcom/desafiolatam/coroutines/view/ui/TaskAdapter;)V", "binding", "Lcom/desafiolatam/coroutines/databinding/ActivityMainBinding;", "viewModel", "Lcom/desafiolatam/coroutines/view/TaskViewModel;", "getViewModel", "()Lcom/desafiolatam/coroutines/view/TaskViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "borrar", "", "task", "Lcom/desafiolatam/coroutines/data/TaskEntity;", "getTaskList", "initRecyclerView", "taskList", "", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.desafiolatam.coroutines.view.ui.Fab, android.view.View.OnClickListener {
    private com.desafiolatam.coroutines.databinding.ActivityMainBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject
    public com.desafiolatam.coroutines.view.ui.TaskAdapter adapter;
    
    public MainActivity() {
        super();
    }
    
    private final com.desafiolatam.coroutines.view.TaskViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.desafiolatam.coroutines.view.ui.TaskAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.view.ui.TaskAdapter p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getTaskList() {
    }
    
    private final void initRecyclerView(java.util.List<com.desafiolatam.coroutines.data.TaskEntity> taskList) {
    }
    
    private final void borrar(com.desafiolatam.coroutines.data.TaskEntity task) {
    }
}