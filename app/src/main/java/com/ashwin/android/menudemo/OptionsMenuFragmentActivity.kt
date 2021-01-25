package com.ashwin.android.menudemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

class OptionsMenuFragmentActivity : AppCompatActivity() {
    private val TAG = OptionsMenuFragmentActivity::class.java.simpleName

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase)
        Log.d(Constants.APP_TAG, "$TAG: attachBaseContext")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_optionsmenu_fragment)
        Log.d(Constants.APP_TAG, "$TAG: onCreate")

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, OptionsMenuFragment.newInstance())
            .commit()
    }

    override fun onStart() {
        super.onStart()
        Log.d(Constants.APP_TAG, "$TAG: onStart")
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        Log.d(Constants.APP_TAG, "$TAG: onPostCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Constants.APP_TAG, "$TAG: onResume")
    }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)
        Log.d(Constants.APP_TAG, "$TAG: onAttachFragment")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.d(Constants.APP_TAG, "$TAG: onAttachedToWindow")
    }
}
