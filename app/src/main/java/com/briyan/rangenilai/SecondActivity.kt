package com.briyan.rangenilai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second2.*


class SecondActivity : AppCompatActivity() {
    private var ket = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)


        val intent = intent
        val nim = intent.getStringExtra("nim")
        val name = intent.getStringExtra("name")
        val nilai = intent.getStringExtra("nilai")

        val n = nilai?.toInt()?:0

        if (n >= 80 && n  <= 100) {
            ket = "A"
        }else if (n >= 60 && n <80) {
            ket = "B"
        }else if (n >= 40 && n <60) {
            ket = "C"
        }else if (n >= 20 && n <40) {
            ket = "D"
        }else if (n >= 0 && n <20) {
            ket = "E"
        }else{
            ket = "nilai yang anda masukkan salah"
        }

        val textViewHasil = findViewById<TextView>(R.id.textViewHasil)
        textViewHasil.text = "Nim             : "+nim+"\nNama          : "+name+"\nNilai            : "+nilai+"\nKeterangan: "+ket

        btnBack.setOnClickListener {
            val intent = Intent (this@SecondActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
