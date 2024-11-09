package com.desafiolatam.coroutines.view.ui;

import android.graphics.Paint;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.desafiolatam.coroutines.data.TaskEntity;
import com.desafiolatam.coroutines.databinding.ItemTaskBinding;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\t2\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u001c\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006!"}, d2 = {"Lcom/desafiolatam/coroutines/view/ui/TaskAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/desafiolatam/coroutines/view/ui/TaskAdapter$TaskViewHolder;", "()V", "binding", "Lcom/desafiolatam/coroutines/databinding/ItemTaskBinding;", "onLongClick", "Lkotlin/Function1;", "Lcom/desafiolatam/coroutines/data/TaskEntity;", "", "getOnLongClick", "()Lkotlin/jvm/functions/Function1;", "setOnLongClick", "(Lkotlin/jvm/functions/Function1;)V", "onTaskCheckedChange", "getOnTaskCheckedChange", "setOnTaskCheckedChange", "taskList", "", "getTaskList", "()Ljava/util/List;", "setTaskList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TaskViewHolder", "app_debug"})
public final class TaskAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.desafiolatam.coroutines.view.ui.TaskAdapter.TaskViewHolder> {
    private com.desafiolatam.coroutines.databinding.ItemTaskBinding binding;
    public java.util.List<com.desafiolatam.coroutines.data.TaskEntity> taskList;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super com.desafiolatam.coroutines.data.TaskEntity, kotlin.Unit> onLongClick;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super com.desafiolatam.coroutines.data.TaskEntity, kotlin.Unit> onTaskCheckedChange;
    
    public TaskAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.desafiolatam.coroutines.data.TaskEntity> getTaskList() {
        return null;
    }
    
    public final void setTaskList(@org.jetbrains.annotations.NotNull
    java.util.List<com.desafiolatam.coroutines.data.TaskEntity> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<com.desafiolatam.coroutines.data.TaskEntity, kotlin.Unit> getOnLongClick() {
        return null;
    }
    
    public final void setOnLongClick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super com.desafiolatam.coroutines.data.TaskEntity, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<com.desafiolatam.coroutines.data.TaskEntity, kotlin.Unit> getOnTaskCheckedChange() {
        return null;
    }
    
    public final void setOnTaskCheckedChange(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super com.desafiolatam.coroutines.data.TaskEntity, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.desafiolatam.coroutines.view.ui.TaskAdapter.TaskViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.desafiolatam.coroutines.view.ui.TaskAdapter.TaskViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/desafiolatam/coroutines/view/ui/TaskAdapter$TaskViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/desafiolatam/coroutines/databinding/ItemTaskBinding;", "(Lcom/desafiolatam/coroutines/view/ui/TaskAdapter;Lcom/desafiolatam/coroutines/databinding/ItemTaskBinding;)V", "onBind", "", "task", "Lcom/desafiolatam/coroutines/data/TaskEntity;", "app_debug"})
    public final class TaskViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.desafiolatam.coroutines.databinding.ItemTaskBinding binding = null;
        
        public TaskViewHolder(@org.jetbrains.annotations.NotNull
        com.desafiolatam.coroutines.databinding.ItemTaskBinding binding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.desafiolatam.coroutines.data.TaskEntity task) {
        }
    }
}