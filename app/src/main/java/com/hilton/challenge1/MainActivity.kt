package com.hilton.challenge1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var editText: EditText
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById()
        click()
    }

    private fun findViewById(){
        button = findViewById(R.id.check_button)
        editText = findViewById(R.id.editText)
        textView = findViewById(R.id.check_message)
    }

    private fun check(){
        val word = editText.palindromeGetText()
        val reversed = word.reversed()
        if (word.equals(reversed)) textView.text = getString(R.string.is_palindrome) else textView.text = getString(R.string.not_palindrome)
    }

    private fun click(){
        button.setOnClickListener { check() }
    }
}

fun EditText.palindromeGetText() = text.toString().lowercase().replace(" ","")
