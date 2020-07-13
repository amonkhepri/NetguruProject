package com.example.netguruproject

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MyViewModel @ViewModelInject constructor(
    private val repository: CompassRepository,
    @Assisted private  val savedStateHandle: SavedStateHandle) : ViewModel(), LifecycleObserver{

    companion object {const val KEY = "KEY"}
    private val showTextLiveData = savedStateHandle.getLiveData<String>(KEY)
}