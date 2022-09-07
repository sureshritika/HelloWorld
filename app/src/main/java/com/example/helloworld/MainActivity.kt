package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val introText = findViewById<TextView>(R.id.introTextView)
        val helloButton = findViewById<Button>(R.id.helloButton)
        val introColorChangeButton = findViewById<Button>(R.id.introColorChangeButton)

        helloButton.setOnClickListener {
            Log.v("Hello world" , "Button clicked!")
            Toast.makeText(this , "Hello to you too!" , Toast.LENGTH_SHORT).show()
        }

        introColorChangeButton.setOnClickListener {
            val rnd = Random.Default
            val clr = Color.argb(255 , rnd.nextInt(256) , rnd.nextInt(256) , rnd.nextInt(256))
            Log.v("color change" , "Intro text color changed")
            introText.setTextColor(clr)
        }

    }
}

