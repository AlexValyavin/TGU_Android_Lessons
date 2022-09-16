package com.example.multiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick1(view: View){
        val tv = findViewById<View>(R.id.textView)
         val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

} 