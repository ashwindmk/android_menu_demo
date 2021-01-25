package com.ashwin.android.menudemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_popupmenu_group.*

class PopupMenuGroupActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener, View.OnClickListener {
    private val TAG = PopupMenuCompatActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popupmenu_group)

        edit.setOnClickListener(this)
    }

    fun showPopup(v: View) {
        Log.d(Constants.APP_TAG, "$TAG: showPopup")
        val popup = PopupMenu(this, v)
        val inflater: MenuInflater = popup.menuInflater
        inflater.inflate(R.menu.popup_group_menu, popup.menu)
        popup.setOnMenuItemClickListener(this@PopupMenuGroupActivity)

        // Set menu item visibility
        popup.menu.setGroupVisible(R.id.group_keep, addgroup_checkbox.isChecked)
        popup.menu.setGroupVisible(R.id.group_remove, removegroup_checkbox.isChecked)

        popup.show()
    }

    override fun onMenuItemClick(item: MenuItem): Boolean {
        Log.d(Constants.APP_TAG, "$TAG: onMenuItemClick")
        return when (item.itemId) {
            R.id.menu_block -> {
                Log.d(Constants.APP_TAG, "$TAG: onMenuItemClick: block_menu")
                true
            }
            R.id.menu_files -> {
                Log.d(Constants.APP_TAG, "$TAG: onMenuItemClick: block_menu")
                true
            }
            R.id.menu_settings -> {
                Log.d(Constants.APP_TAG, "$TAG: onMenuItemClick: settings_menu")
                true
            }
            else -> {
                Log.d(Constants.APP_TAG, "$TAG: onMenuItemClick: else")
                false
            }
        }
    }

    override fun onClick(v: View?) {
        Log.d(Constants.APP_TAG, "$TAG: onClick")
        when (v?.id) {
            R.id.edit -> {
                Log.d(Constants.APP_TAG, "$TAG: onClick: R.id.edit")
            }
            else -> Log.d(Constants.APP_TAG, "$TAG: onClick: else")
        }
    }
}
