package io.valueof.lifecycleobserverdemo.ui.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.valueof.lifecycleobserverdemo.util.MyLifecycleTracker
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
  private val myLifecycleTracker: MyLifecycleTracker
) : ViewModel() {
  // TODO: Implement the ViewModel
}