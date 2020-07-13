package com.example.netguruproject.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class ActivityUtils {

    companion object{
        fun addFragmentToActivity(fragmentManager: FragmentManager,
        fragment: Fragment, frameId: Int) {
            checkNotNull(fragmentManager)
            checkNotNull(fragment)
            val transaction = fragmentManager.beginTransaction()
            transaction.add(frameId, fragment)
            transaction.commit()
        }
    }
}