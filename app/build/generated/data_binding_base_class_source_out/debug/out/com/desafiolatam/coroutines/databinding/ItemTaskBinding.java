// Generated by view binder compiler. Do not edit!
package com.desafiolatam.coroutines.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.desafiolatam.coroutines.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemTaskBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CheckBox cbIsCompleted;

  @NonNull
  public final ConstraintLayout clItem;

  @NonNull
  public final View separator;

  @NonNull
  public final AppCompatTextView tvTaskDescription;

  @NonNull
  public final AppCompatTextView tvTaskTitle;

  private ItemTaskBinding(@NonNull ConstraintLayout rootView, @NonNull CheckBox cbIsCompleted,
      @NonNull ConstraintLayout clItem, @NonNull View separator,
      @NonNull AppCompatTextView tvTaskDescription, @NonNull AppCompatTextView tvTaskTitle) {
    this.rootView = rootView;
    this.cbIsCompleted = cbIsCompleted;
    this.clItem = clItem;
    this.separator = separator;
    this.tvTaskDescription = tvTaskDescription;
    this.tvTaskTitle = tvTaskTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_task, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemTaskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cb_is_completed;
      CheckBox cbIsCompleted = ViewBindings.findChildViewById(rootView, id);
      if (cbIsCompleted == null) {
        break missingId;
      }

      ConstraintLayout clItem = (ConstraintLayout) rootView;

      id = R.id.separator;
      View separator = ViewBindings.findChildViewById(rootView, id);
      if (separator == null) {
        break missingId;
      }

      id = R.id.tv_task_description;
      AppCompatTextView tvTaskDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvTaskDescription == null) {
        break missingId;
      }

      id = R.id.tv_task_title;
      AppCompatTextView tvTaskTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTaskTitle == null) {
        break missingId;
      }

      return new ItemTaskBinding((ConstraintLayout) rootView, cbIsCompleted, clItem, separator,
          tvTaskDescription, tvTaskTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
