package edu.temple.activity4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import edu.temple.activity4.MainActivity.Companion.textSize

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val size = intent.getFloatExtra(MainActivity.Companion.textSize, 0f)//intent.getStringExtra(textSize)
        val textView = findViewById<TextView>(R.id.textView)
        textView.textSize = size
        //size?.run {
        //    textView.textSize = this.toFloat()
        //}

        //setResult()
    }
}