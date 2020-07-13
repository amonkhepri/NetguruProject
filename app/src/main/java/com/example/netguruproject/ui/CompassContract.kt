package com.example.netguruproject.ui

import com.example.netguruproject.BaseView

interface CompassContract {
    interface View: BaseView {
        fun updateDirections(directionsUiModel: DirectionsUiModel)

        fun updateCurrentLocation(locationUiModel: LocationUiModel)

        fun updateDestinationLocation (locationUiModel: LocationUiModel)

        fun goToUpdateDestinationPage()

        fun showOnErrorGettingDirections()

        fun showOnErrorGettingLocation()
    }

}