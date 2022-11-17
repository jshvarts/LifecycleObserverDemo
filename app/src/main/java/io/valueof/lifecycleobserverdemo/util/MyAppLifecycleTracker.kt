package io.valueof.lifecycleobserverdemo.util

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MyAppLifecycleTracker @Inject constructor() : DefaultLifecycleObserver {

  override fun onStart(owner: LifecycleOwner) {
    super.onStart(owner)
    println("onStart: $owner")
  }

  override fun onStop(owner: LifecycleOwner) {
    super.onStop(owner)
    println("onStop: $owner")
  }
}