package io.valueof.lifecycleobserverdemo.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import io.valueof.lifecycleobserverdemo.R
import io.valueof.lifecycleobserverdemo.util.MyLifecycleTracker
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {

  companion object {
    fun newInstance() = MainFragment()
  }

  @Inject
  lateinit var myLifecycleTracker: MyLifecycleTracker

  private val viewModel by viewModels<MainViewModel>()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    lifecycle.addObserver(myLifecycleTracker)
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    viewLifecycleOwner.lifecycle.addObserver(myLifecycleTracker)

    return super.onCreateView(inflater, container, savedInstanceState)
  }
}