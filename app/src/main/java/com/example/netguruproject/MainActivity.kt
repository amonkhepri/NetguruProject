package com.example.netguruproject

import android.Manifest.permission.ACCESS_COARSE_LOCATION
import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.netguruproject.ui.CompassFragment
import com.example.netguruproject.utils.ActivityUtils
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mInjectedFragment: CompassFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (appHasPermissions()) launchFragment()
        else requestPermission()
    }

    private fun appHasPermissions(): Boolean {
        return checkFinePermission() && checkCoarsePermission()
    }

    private fun checkFinePermission(): Boolean {
        val result = ContextCompat.checkSelfPermission(this, ACCESS_FINE_LOCATION)

        return result == PackageManager.PERMISSION_GRANTED
    }

    private fun checkCoarsePermission(): Boolean {
        val result = ContextCompat.checkSelfPermission(this, ACCESS_COARSE_LOCATION)

        return result == PackageManager.PERMISSION_GRANTED
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if (requestCode == 1) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                launchFragment()
        } else requestPermission()
    }

    private fun requestPermission() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION),
            1
        )
    }

    private fun launchFragment() {
        var fragment =
            supportFragmentManager.findFragmentById(R.id.contentFrame) as CompassFragment?
        if (fragment == null) {
            fragment = mInjectedFragment
            ActivityUtils.addFragmentToActivity(supportFragmentManager, fragment, R.id.contentFrame)
        }
    }
}