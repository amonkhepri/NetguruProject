package com.example.netguruproject.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CompassFragment @Inject constructor()  : Fragment(), CompassContract.View {

    private val compassViewModel: CompassViewModel by viewModels()

    override fun updateDirections(directionsUiModel: DirectionsUiModel) {
        TODO("Not yet implemented")
    }

    override fun updateCurrentLocation(locationUiModel: LocationUiModel) {
        TODO("Not yet implemented")
    }

    override fun updateDestinationLocation(locationUiModel: LocationUiModel) {
        TODO("Not yet implemented")
    }

    override fun goToUpdateDestinationPage() {
        TODO("Not yet implemented")
    }

    override fun showOnErrorGettingDirections() {
        TODO("Not yet implemented")
    }

    override fun showOnErrorGettingLocation() {
        TODO("Not yet implemented")
    }

    override fun bindViewModel() {
        TODO("Not yet implemented")
    }

    override fun unbindViewModel() {
        TODO("Not yet implemented")
    }
}