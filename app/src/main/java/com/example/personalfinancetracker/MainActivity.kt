package com.example.personalfinancetracker


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Tag used for Logcat (helps with filtering lifecycle logs)
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This sets the layout XML we designed for the welcome screen
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: Welcome screen created")

        // Set up button to navigate to the finance screen
        val btnTrack = findViewById<Button>(R.id.btnTrack)
        btnTrack.setOnClickListener {
            // Explicit intent to open FinanceActivity
            val intent = Intent(this, FinanceActivity::class.java)
            startActivity(intent)
        }

        // Set up button to share sample expense using other apps
        val btnShare = findViewById<Button>(R.id.btnShare)
        btnShare.setOnClickListener {
            // Implicit intent to share text
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "I just added a new expense: Lunch – $30")
            }
            startActivity(Intent.createChooser(shareIntent, "Share with:"))
        }
    }

    // These logs help track activity lifecycle for testing & learning

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: Activity becoming visible")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: Ready for user interaction")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: Activity partially obscured")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: Activity no longer visible")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: Cleanup time")
    }
}
