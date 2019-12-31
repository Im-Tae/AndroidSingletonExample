package com.example.singleton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        kotlinButton.setOnClickListener {
            KotlinDataSingleton.getInstance()?.message = "Hello, World!"
            startActivity(Intent(this, SecondActivity::class.java))
        }

        javaButton.setOnClickListener {
            JavaDataSingleton.getInstance()?.message = "Hello, World!"
            startActivity(Intent(this, SecondActivity::class.java))
        }

    }
}
