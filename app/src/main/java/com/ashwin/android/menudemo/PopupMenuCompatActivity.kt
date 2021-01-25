package com.ashwin.android.menudemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.PopupMenu

class PopupMenuCompatActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener {
    private val TAG = PopupMenuCompatActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popupmenu_compat)
        Log.d(Constants.APP_TAG, "$TAG: onCreate")
    }

    fun showPopup(v: View) {
        Log.d(Constants.APP_TAG, "$TAG: showPopup")
        val popup = PopupMenu(this, v)
        val inflater: MenuInflater = popup.menuInflater
        inflater.inflate(R.menu.popup_menu, popup.menu)
        popup.setOnMenuItemClickListener(this@PopupMenuCompatActivity)
        popup.show()
    }

    override fun onMenuItemClick(item: MenuItem): Boolean {
        Log.d(Constants.APP_TAG, "$TAG: onMenuItemClick")
        return when (item.itemId) {
            R.id.block_menu -> {
                Log.d(Constants.APP_TAG, "$TAG: onMenuItemClick: block_menu")
                true
            }
            R.id.files_menu -> {
                Log.d(Constants.APP_TAG, "$TAG: onMenuItemClick: block_menu")
                true
            }
            R.id.settings_menu -> {
                Log.d(Constants.APP_TAG, "$TAG: onMenuItemClick: settings_menu")
                true
            }
            else -> {
                Log.d(Constants.APP_TAG, "$TAG: onMenuItemClick: else")
                false
            }
        }
    }
}
