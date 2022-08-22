package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

//kotlin  = UI
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //show layout file act_main
        setContentView(R.layout.activity_main)
//
        findViewById<Button>(R.id.button).setOnClickListener{
            //handles button tap
            Log.i("Alan", "Tapped Button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

        }
        //display
        //Button
    }
}