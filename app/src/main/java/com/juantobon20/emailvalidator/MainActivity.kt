package com.juantobon20.emailvalidator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import com.juantobon20.email_validator.EmailValidate

import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.edit_text)
        val validate: Button = findViewById(R.id.button)
        validate.setOnClickListener { v ->
            if (EmailValidate()
                    .isValid(email.text.toString())
            ) Toast.makeText(this@MainActivity, getString(R.string.valid), Toast.LENGTH_SHORT)
                .show() else Toast.makeText(
                this@MainActivity,
                getString(R.string.invalid),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}