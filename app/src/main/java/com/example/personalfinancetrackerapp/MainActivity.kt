package com.example.personalfinancetrackerapp


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.personalfinancetrackerapp.FinanceActivity

class MainActivity : AppCompatActivity() {

    // Tag used for Logcat
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This connects to  the layout XML we designed
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: Welcome screen created")

        // Set up button to navigate to the finance screen
        val btnTrack = findViewById<Button>(R.id.btnTrack)
        btnTrack.setOnClickListener {
            // Explicit intent to open FinanceActivity
            val intent = Intent(this, FinanceActivity::class.java)
            startActivity(intent)
        }

        //  button to share logic
        val btnShare = findViewById<Button>(R.id.btnShare)
        btnShare.setOnClickListener {
            // Implicit intent to share text
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "I just added a new expense: Lunch – $10")
            }
            startActivity(Intent.createChooser(shareIntent, "Share with:"))
        }
    }

    //  Lifecycle Logging
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
