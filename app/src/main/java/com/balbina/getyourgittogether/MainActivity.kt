package com.balbina.getyourgittogether

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToastBtn.setOnClickListener {
            Toast.makeText(this, "Show toast nr 1", Toast.LENGTH_SHORT).show()
        }

        showToastBtn2.setOnClickListener {
            Toast.makeText(this, "Show toast nr 2", Toast.LENGTH_SHORT).show()
        }

        showToastBtn3.setOnClickListener {
            Toast.makeText(this, "Show toast nr 3", Toast.LENGTH_SHORT).show()
        }
    }
}