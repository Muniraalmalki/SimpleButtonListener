package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var kotlinButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kotlinButton = findViewById(R.id.kotlinButton)
        kotlinButton.setOnClickListener {
            toast()
        }
    }
    private fun toast(){
        Toast.makeText(this,"Done press successfully",Toast.LENGTH_LONG).show()
    }
    fun test(view: android.view.View) {
        toast()
    }
}