package com.ashwin.android.menudemo

import android.content.Context
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.fragment.app.Fragment

class OptionsMenuCompatActivity : AppCompatActivity() {
    private val TAG = OptionsMenuCompatActivity::class.java.simpleName

    override fun onApplyThemeResource(theme: Resources.Theme?, resid: Int, first: Boolean) {
        super.onApplyThemeResource(theme, resid, first)
        Log.d(Constants.APP_TAG, "$TAG: onApplyThemeResource")
    }

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase)
        Log.d(Constants.APP_TAG, "$TAG: attachBaseContext")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_optionsmenu_compat)
        Log.d(Constants.APP_TAG, "$TAG: onCreate")
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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        Log.d(Constants.APP_TAG, "$TAG: onCreateOptionsMenu")
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.options_menu, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        Log.d(Constants.APP_TAG, "$TAG: onPrepareOptionsMenu")
        return super.onPrepareOptionsMenu(menu)
    }

    override fun openOptionsMenu() {
        Log.d(Constants.APP_TAG, "$TAG: openOptionsMenu")
        super.openOptionsMenu()
    }

    override fun onMenuOpened(featureId: Int, menu: Menu): Boolean {
        Log.d(Constants.APP_TAG, "$TAG: onMenuOpened")
        return super.onMenuOpened(featureId, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Log.d(Constants.APP_TAG, "$TAG: onOptionsItemSelected")
        return when (item.itemId) {
            R.id.menu_block -> {
                Log.d(Constants.APP_TAG, "$TAG: onOptionsItemSelected: block_menu")
                true
            }
            R.id.menu_files -> {
                Log.d(Constants.APP_TAG, "$TAG: onOptionsItemSelected: files_menu")
                true
            }
            R.id.menu_settings -> {
                Log.d(Constants.APP_TAG, "$TAG: onOptionsItemSelected: settings_menu")
                true
            }
            else -> {
                Log.d(Constants.APP_TAG, "$TAG: onOptionsItemSelected: else")
                super.onOptionsItemSelected(item)
            }
        }
    }

    override fun closeOptionsMenu() {
        Log.d(Constants.APP_TAG, "$TAG: closeOptionsMenu")
        super.closeOptionsMenu()
    }

    override fun onOptionsMenuClosed(menu: Menu?) {
        Log.d(Constants.APP_TAG, "$TAG: onOptionsMenuClosed")
        super.onOptionsMenuClosed(menu)
    }
}
