package com.example.netguruproject

import dagger.hilt.EntryPoint
import javax.inject.Inject

@EntryPoint
class CompassRepository @Inject constructor(private val compassOrientationSource: OrientationDataSource,
private val compassLocationDataSource: LocationDataSource) {

    override  fun getOrien
    fun getMessage() = "From Repository"
}