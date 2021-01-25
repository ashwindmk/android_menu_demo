package com.ashwin.android.menudemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater

class OptionsMenuFullScreenActivity : AppCompatActivity() {
    private val TAG = OptionsMenuFullScreenActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_optionsmenu_fullscreen)
        Log.d(Constants.APP_TAG, "$TAG: onCreate")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        Log.d(Constants.APP_TAG, "$TAG: onCreateOptionsMenu")
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.options_menu, menu)
        return true
    }

    override fun openOptionsMenu() {
        super.openOptionsMenu()
        Log.d(Constants.APP_TAG, "$TAG: openOptionsMenu")
    }
}