package com.briyan.rangenilai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var nimEt:EditText
    private lateinit var nameEt:EditText
    private lateinit var nilaiEt:EditText
    private lateinit var btnProses:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nimEt = findViewById(R.id.nimEt)
        nameEt = findViewById(R.id.nameEt)
        nilaiEt = findViewById(R.id.nilaiEt)
        btnProses = findViewById(R.id.btnProses)

        btnProses.setOnClickListener {

            val intent = Intent (this@MainActivity,SecondActivity::class.java)
            intent.putExtra("nim", nimEt.text.toString())
            intent.putExtra("name", nameEt.text.toString())
            intent.putExtra("nilai",nilaiEt.text.toString())


            startActivity(intent)

        }
    }
}
