package io.valueof.lifecycleobserverdemo

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner
import dagger.hilt.android.HiltAndroidApp
import io.valueof.lifecycleobserverdemo.util.MyAppLifecycleTracker
import javax.inject.Inject

@HiltAndroidApp
class LifecycleObserverDemoApp : Application() {

  @Inject
  lateinit var myAppLifecycleTracker: MyAppLifecycleTracker

  override fun onCreate() {
    super.onCreate()
    ProcessLifecycleOwner
      .get()
      .lifecycle
      .addObserver(myAppLifecycleTracker)
  }
}