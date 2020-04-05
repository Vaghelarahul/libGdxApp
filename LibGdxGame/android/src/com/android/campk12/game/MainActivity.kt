package com.android.campk12.game

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Rahul Vaghela on 18/3/20
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val textView = findViewById<TextView>(R.id.launch_game)
        textView.setOnClickListener { launch() }

    }

    private fun launch() {
        val intent = Intent(this, AndroidLauncher::class.java)
        startActivity(intent)
    }

}