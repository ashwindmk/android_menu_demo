package com.ashwin.android.menudemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PopupMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popupmenu)
    }

    fun gotoPopupMenuCompat(view: View) {
        startActivity(Intent(PopupMenuActivity@this, PopupMenuCompatActivity::class.java))
    }
}
