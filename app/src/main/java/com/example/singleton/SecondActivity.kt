package com.example.singleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        kotlinText.text = KotlinDataSingleton.getInstance()?.message
        javaText.text = JavaDataSingleton.getInstance()?.message
    }
}
