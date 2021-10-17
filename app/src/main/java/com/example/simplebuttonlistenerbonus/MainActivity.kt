package com.example.simplebuttonlistenerbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btKotlin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btKotlin=findViewById(R.id.btKotlin)
        btKotlin.setOnClickListener {
            Toast.makeText(this,"CODE",Toast.LENGTH_SHORT).show()
        }
    }
    fun toastXML(view: View){
        Toast.makeText(this,"XML",Toast.LENGTH_SHORT).show()
    }
}