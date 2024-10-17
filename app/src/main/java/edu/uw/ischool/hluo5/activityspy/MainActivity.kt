package edu.uw.ischool.hluo5.activityspy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("ActivitySpy", "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ActivitySpy", "onResume event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ActivitySpy", "onPause event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ActivitySpy", "onStop event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ActivitySpy", "We're going down, Captain! --Star Trek")
    }

}