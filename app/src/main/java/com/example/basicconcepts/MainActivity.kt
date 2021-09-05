package com.example.basicconcepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var title: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changeNamebutton: Button = findViewById(R.id.button)
        val input: EditText = findViewById(R.id.input)

        changeNamebutton.setOnClickListener {
            title = findViewById(R.id.title)

            title.text = input.text
        }

        val plusNumberButton: Button = findViewById(R.id.plus)
        val lessNumberButton: Button = findViewById(R.id.less)
        val number:TextView = findViewById(R.id.number)

        plusNumberButton.setOnClickListener{
            val currentNUmber = number.text.toString().toInt()
            if(currentNUmber < 10) number.setText((number.text.toString().toInt() + 1).toString())
        }

        lessNumberButton.setOnClickListener{
            val currentNumber = number.text.toString().toInt()

            if(currentNumber > 0) number.setText((number.text.toString().toInt() - 1).toString())
        }

    }
}