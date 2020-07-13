package com.example.netguruproject.ui

import androidx.lifecycle.ViewModel
import com.example.netguruproject.CompassRepository
import javax.inject.Inject

class CompassViewModel @Inject constructor(val repository: CompassRepository) : ViewModel() {

    private fun constructCompassUiModel(compassOrientation: CompassOrientation): DirectionsUiModel{
        return DirectionsUiModel()
    }
}