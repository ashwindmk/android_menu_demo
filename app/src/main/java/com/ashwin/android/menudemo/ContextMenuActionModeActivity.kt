package com.ashwin.android.menudemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_contextmenu_actionmode.*

class ContextMenuActionModeActivity : AppCompatActivity(), ActionMode.Callback {
    private val TAG = ContextMenuActionModeActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contextmenu_actionmode)
        Log.d(Constants.APP_TAG, "$TAG: onCreate")

        contextmenu_actionmode_button.setOnLongClickListener {
            it.startActionMode(this@ContextMenuActionModeActivity)
            return@setOnLongClickListener true
        }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.d(Constants.APP_TAG, "$TAG: onAttachedToWindow")
    }

    override fun onCreateActionMode(mode: ActionMode, menu: Menu?): Boolean {
        Log.d(Constants.APP_TAG, "$TAG: onCreateActionMode")
        val inflater: MenuInflater = mode.menuInflater
        inflater.inflate(R.menu.context_menu, menu)
        return true
    }

    override fun onPrepareActionMode(mode: ActionMode?, menu: Menu?): Boolean {
        Log.d(Constants.APP_TAG, "$TAG: onPrepareActionMode")
        return false
    }

    override fun onActionItemClicked(mode: ActionMode, item: MenuItem): Boolean {
        Log.d(Constants.APP_TAG, "$TAG: onActionItemClicked")
        return when (item.itemId) {
            R.id.menu_block -> {
                Log.d(Constants.APP_TAG, "$TAG: onActionItemClicked: menu_block")
                mode.finish()  // Action picked, so close the CAB, onDestroyActionMode will be called
                true
            }
            R.id.menu_files -> {
                Log.d(Constants.APP_TAG, "$TAG: onActionItemClicked: menu_files")
                mode.finish()
                true
            }
            else -> {
                Log.d(Constants.APP_TAG, "$TAG: onActionItemClicked: else")
                false
            }
        }
    }

    override fun onDestroyActionMode(mode: ActionMode?) {
        Log.d(Constants.APP_TAG, "$TAG: onDestroyActionMode")
    }
}