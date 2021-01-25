package com.ashwin.android.menudemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ContextMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contextmenu)
    }

    fun gotoContextMenuFloating(view: View) {
        startActivity(Intent(this@ContextMenuActivity, ContextMenuFloatingActivity::class.java))
    }

    fun gotoContextMenuActionMode(view: View) {
        startActivity(Intent(this@ContextMenuActivity, ContextMenuActionModeActivity::class.java))
    }
}
