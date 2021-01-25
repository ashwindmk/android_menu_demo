package com.ashwin.android.menudemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_contextmenu_floating.*

class ContextMenuFloatingActivity : AppCompatActivity() {
    private val TAG = ContextMenuFloatingActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contextmenu_floating)
        Log.d(Constants.APP_TAG, "$TAG: onCreate")

        registerForContextMenu(contextmenu_floating_button)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        Log.d(Constants.APP_TAG, "$TAG: onCreateContextMenu")
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.context_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        Log.d(Constants.APP_TAG, "$TAG: onContextItemSelected")
        return when (item.itemId) {
            R.id.menu_block -> {
                Log.d(Constants.APP_TAG, "$TAG: onContextItemSelected: block_menu")
                true
            }
            R.id.menu_files -> {
                Log.d(Constants.APP_TAG, "$TAG: onContextItemSelected: files_menu")
                true
            }
            else -> {
                Log.d(Constants.APP_TAG, "$TAG: onContextItemSelected: else")
                super.onContextItemSelected(item)
            }
        }
    }
}
