package com.desafiolatam.coroutines.view.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.desafiolatam.coroutines.R;
import com.desafiolatam.coroutines.data.TaskEntity;
import com.desafiolatam.coroutines.databinding.ActivityNewTaskBinding;
import com.desafiolatam.coroutines.view.TaskViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/desafiolatam/coroutines/view/ui/NewTaskActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/desafiolatam/coroutines/databinding/ActivityNewTaskBinding;", "viewModel", "Lcom/desafiolatam/coroutines/view/TaskViewModel;", "getViewModel", "()Lcom/desafiolatam/coroutines/view/TaskViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "agregarTarea", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class NewTaskActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.desafiolatam.coroutines.databinding.ActivityNewTaskBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public NewTaskActivity() {
        super();
    }
    
    private final com.desafiolatam.coroutines.view.TaskViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void agregarTarea() {
    }
}