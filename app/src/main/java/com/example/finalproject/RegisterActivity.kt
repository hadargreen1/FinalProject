package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

class RegisterActivity : AppCompatActivity() {

    private lateinit var quizTitle: MaterialTextView
    private lateinit var userName: MaterialTextView
    private lateinit var nameField: TextInputEditText
    private lateinit var userEmail: MaterialTextView
    private lateinit var emailField: TextInputEditText
    private lateinit var userPassword: MaterialTextView
    private lateinit var passwordField: TextInputEditText
    private lateinit var confirmPassword: MaterialTextView
    private lateinit var confirmPasswordField: TextInputEditText
    private lateinit var registerButton: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        findViews()
        registerButton.setOnClickListener { onRegisterButtonClick() }
    }

    private fun onRegisterButtonClick() {
        // Navigate to com.example.finalproject.HealthQuizActivity
        val intent = Intent(this, HealthQuizActivity::class.java)
        startActivity(intent)
    }

    private fun findViews() {
        quizTitle = findViewById(R.id.quiz_title)
        userName = findViewById(R.id.user_name)
        nameField = findViewById(R.id.name_field)
        userEmail = findViewById(R.id.user_email)
        emailField = findViewById(R.id.email_field)
        userPassword = findViewById(R.id.user_password)
        passwordField = findViewById(R.id.password_field)
        confirmPassword = findViewById(R.id.user_confirm_password)
        confirmPasswordField = findViewById(R.id.confirm_password_field)
        registerButton = findViewById(R.id.register_button)
    }
}
