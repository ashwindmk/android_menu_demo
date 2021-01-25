package com.ashwin.android.menudemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gotoOptionsMenu(view: View) {
        startActivity(Intent(MainActivity@this, OptionsMenuActivity::class.java))
    }

    fun gotoContextMenu(view: View) {

    }

    fun gotoPopupMenu(view: View) {
        startActivity(Intent(MainActivity@this, PopupMenuActivity::class.java))
    }
}
