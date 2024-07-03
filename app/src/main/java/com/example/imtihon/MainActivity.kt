package com.example.imtihon

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var textView1: TextView
    private lateinit var textView2: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.edt)
        textView1 = findViewById(R.id.txt1)
        textView2 = findViewById(R.id.txt2)
        button = findViewById(R.id.button)


        editText.addTextChangedListener {
            val str1 = editText.text.toString()
            textView1.text = str1
        }

        val str2 = editText.text.toString()
            textView1.text=textView2.text.substring(1,str2.length)
        str2[0].toString()

    }
}
