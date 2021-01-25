package com.ashwin.android.menudemo

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class OptionsMenuFragment : Fragment() {
    companion object {
        @JvmStatic
        fun newInstance() =
            OptionsMenuFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, "one")
                    putString(ARG_PARAM2, "two")
                }
            }
    }

    private var param1: String? = null
    private var param2: String? = null

    private val TAG = OptionsMenuFragment::class.java.simpleName

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(Constants.APP_TAG, "$TAG: onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        Log.d(Constants.APP_TAG, "$TAG: onCreate")
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(Constants.APP_TAG, "$TAG: onCreateView")
        return inflater.inflate(R.layout.fragment_optionsmenu, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(Constants.APP_TAG, "$TAG: onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(Constants.APP_TAG, "$TAG: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Constants.APP_TAG, "$TAG: onResume")
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        Log.d(Constants.APP_TAG, "$TAG: onCreateOptionsMenu")
        menu.clear()
        inflater.inflate(R.menu.options_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        super.onPrepareOptionsMenu(menu)
        Log.d(Constants.APP_TAG, "$TAG: onPrepareOptionsMenu")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Log.d(Constants.APP_TAG, "$TAG: onOptionsItemSelected")
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu()
        Log.d(Constants.APP_TAG, "$TAG: onDestroyOptionsMenu")
    }
}
