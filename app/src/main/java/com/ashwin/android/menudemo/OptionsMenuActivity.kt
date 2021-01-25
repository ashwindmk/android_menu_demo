package com.ashwin.android.menudemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OptionsMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_optionsmenu)
    }

    fun gotoOptionsMenuCompat(view: View) {
        startActivity(Intent(OptionsMenuActivity@this, OptionsMenuCompatActivity::class.java))
    }

    fun gotoOptionsMenuFragment(view: View) {
        startActivity(Intent(OptionsMenuActivity@this, OptionsMenuFragmentActivity::class.java))
    }

    fun gotoOptionsMenuFullScreen(view: View) {
        startActivity(Intent(OptionsMenuActivity@this, OptionsMenuFullScreenActivity::class.java))
    }
}