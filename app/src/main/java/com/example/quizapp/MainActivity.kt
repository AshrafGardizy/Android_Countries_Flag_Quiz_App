package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.quizapp.ui.QuestionsActivity
import com.example.quizapp.utils.Constants

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startButton:AppCompatButton = findViewById(R.id.button_start)
        val editTextInput:AppCompatEditText = findViewById(R.id.name)

        //Even for Start Button
        startButton.setOnClickListener {
            if(!editTextInput.text.toString().isEmpty()){
                Intent(this,QuestionsActivity::class.java).also {
                    it.putExtra(Constants.USER_NAME,editTextInput.text.toString())
                    startActivity(it)
                    finish()
                }
            }else{
                editTextInput.setError("Please enter a name")
            }
        }
    }
}