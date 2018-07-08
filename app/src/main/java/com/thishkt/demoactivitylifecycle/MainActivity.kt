package com.thishkt.demoactivitylifecycle

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate ...")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart ...")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume ...")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause ...")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop ...")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy ...")
    }
}
