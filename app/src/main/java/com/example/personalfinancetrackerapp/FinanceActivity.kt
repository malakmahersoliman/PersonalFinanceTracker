package com.example.personalfinancetrackerapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.text.isNotBlank

class FinanceActivity : AppCompatActivity() {

    private val TAG = "FinanceActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finance)
        Log.d(TAG, "onCreate: Expense form screen loaded")

        // Get references to the input fields
        val etName = findViewById<EditText>(R.id.etExpenseName)
        val etAmount = findViewById<EditText>(R.id.etAmount)
        val etCategory = findViewById<EditText>(R.id.etCategory)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnBack = findViewById<Button>(R.id.btnBack)

        // Handle Save button click
        btnSave.setOnClickListener {
            val name = etName.text.toString()
            val amount = etAmount.text.toString()
            val category = etCategory.text.toString()

            if (name.isNotBlank() && amount.isNotBlank() && category.isNotBlank()) {
                // For now, just show a confirmation
                Toast.makeText(this, "Expense saved: $name - $$amount [$category]", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
        // back button logic
        btnBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

    }

    //  Lifecycle Logging
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}