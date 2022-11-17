package io.valueof.lifecycleobserverdemo.util

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class MyLifecycleTracker @Inject constructor() : DefaultLifecycleObserver, LifecycleEventObserver {

  override fun onStart(owner: LifecycleOwner) {
    super.onStart(owner)
    println("onStart: $owner")
  }

  override fun onStop(owner: LifecycleOwner) {
    super.onStop(owner)
    println("onStop: $owner")
  }

  override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
    when (event) {
      Lifecycle.Event.ON_CREATE -> println("onCreate event: $source")
      Lifecycle.Event.ON_START -> println("onStart event: $source")
      Lifecycle.Event.ON_RESUME -> println("onResume event: $source")
      Lifecycle.Event.ON_PAUSE -> println("onPause event: $source")
      Lifecycle.Event.ON_STOP -> println("onStop event: $source")
      Lifecycle.Event.ON_DESTROY -> println("onDestroy event: $source")
      Lifecycle.Event.ON_ANY -> println("onAny event: $source")
    }
  }
}