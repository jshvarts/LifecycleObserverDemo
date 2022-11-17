package io.valueof.lifecycleobserverdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import io.valueof.lifecycleobserverdemo.ui.main.MainFragment
import io.valueof.lifecycleobserverdemo.util.MyLifecycleTracker
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

  @Inject
  lateinit var myLifecycleTracker: MyLifecycleTracker

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    lifecycle.addObserver(myLifecycleTracker)

    if (savedInstanceState == null) {
      supportFragmentManager.beginTransaction()
        .replace(R.id.container, MainFragment.newInstance())
        .commitNow()
    }
  }
}