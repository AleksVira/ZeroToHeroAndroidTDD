package ru.easycode.zerotoheroandroidtdd

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.titleTextView)
        val hideButton = findViewById<Button>(R.id.hideButton)
        hideButton.setOnClickListener {
            textView.visibility = View.GONE
        }
        savedInstanceState?.let {
            textView.visibility = View.GONE
        }
    }

}