package com.example.finalproject

import com.example.finalproject.RegisterActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {
    private lateinit var testButton: ExtendedFloatingActionButton
    private lateinit var testText: MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViews()

        testButton.setOnClickListener{moveActivity()}
    }

    private fun findViews(){
        testButton = findViewById(R.id.test_button)
        testText = findViewById(R.id.test_text)
    }
    private fun moveActivity() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)

    }
}