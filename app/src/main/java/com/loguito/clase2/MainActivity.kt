package com.loguito.clase2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val emailEditText: TextInputEditText = findViewById(R.id.emailEditText)
        val passwordEditText: TextInputEditText = findViewById(R.id.passwordEditText)
        val emailTextInputLayout: TextInputLayout = findViewById(R.id.textInputLayout)
        val passwordTextInputLayout: TextInputLayout = findViewById(R.id.textInputLayout2)

//        button.setOnClickListener {
//            emailTextInputLayout.error = if (emailEditText.text.toString().isEmpty()) "Email requerido" else null
//            passwordTextInputLayout.error = if (passwordEditText.text.toString().isEmpty()) "Password requerido" else null
//        }

        emailEditText.addTextChangedListener {
            emailTextInputLayout.error = if (emailEditText.text.toString().isEmpty()) "Email requerido" else null
        }

        passwordEditText.addTextChangedListener {
            passwordTextInputLayout.error = if (passwordEditText.text.toString().isEmpty()) "Password requerido" else null
        }
    }
}