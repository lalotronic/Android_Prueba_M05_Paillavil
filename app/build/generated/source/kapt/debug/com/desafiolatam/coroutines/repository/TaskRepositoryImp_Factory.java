// Generated by Dagger (https://dagger.dev).
package com.desafiolatam.coroutines.repository;

import com.desafiolatam.coroutines.data.TaskDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TaskRepositoryImp_Factory implements Factory<TaskRepositoryImp> {
  private final Provider<TaskDao> taskDaoProvider;

  public TaskRepositoryImp_Factory(Provider<TaskDao> taskDaoProvider) {
    this.taskDaoProvider = taskDaoProvider;
  }

  @Override
  public TaskRepositoryImp get() {
    return newInstance(taskDaoProvider.get());
  }

  public static TaskRepositoryImp_Factory create(Provider<TaskDao> taskDaoProvider) {
    return new TaskRepositoryImp_Factory(taskDaoProvider);
  }

  public static TaskRepositoryImp newInstance(TaskDao taskDao) {
    return new TaskRepositoryImp(taskDao);
  }
}