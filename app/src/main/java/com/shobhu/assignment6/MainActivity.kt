package com.shobhu.assignment6

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val handler = Handler(Looper.getMainLooper())
    private val interval: Long = 1000 // 5000 ms = 5 seconds

    private val toastRunnable = object : Runnable {
        override fun run() {
            Toast.makeText(this@MainActivity, "This is a Toast Message!", Toast.LENGTH_SHORT).show()
            handler.postDelayed(this, interval) // re-run after the interval
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // start the repeating Toast
        handler.post(toastRunnable)
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(toastRunnable) // stop when activity is destroyed
    }
}
