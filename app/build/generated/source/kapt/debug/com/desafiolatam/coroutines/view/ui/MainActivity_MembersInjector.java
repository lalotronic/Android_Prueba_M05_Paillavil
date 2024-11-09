// Generated by Dagger (https://dagger.dev).
package com.desafiolatam.coroutines.view.ui;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<TaskAdapter> adapterProvider;

  public MainActivity_MembersInjector(Provider<TaskAdapter> adapterProvider) {
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<TaskAdapter> adapterProvider) {
    return new MainActivity_MembersInjector(adapterProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectAdapter(instance, adapterProvider.get());
  }

  @InjectedFieldSignature("com.desafiolatam.coroutines.view.ui.MainActivity.adapter")
  public static void injectAdapter(MainActivity instance, TaskAdapter adapter) {
    instance.adapter = adapter;
  }
}
