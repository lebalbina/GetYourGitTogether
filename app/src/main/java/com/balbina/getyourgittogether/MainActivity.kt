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
            mergeConflictedMethod(getString(R.string.toast_btn_1))
        }

        showToastBtn2.setOnClickListener {
            mergeConflictedMethod(getString(R.string.toast_btn_2))
        }

        showToastBtn3.setOnClickListener {
            mergeConflictedMethod(getString(R.string.toast_btn_3))
        }
    }

    private fun mergeConflictedMethod(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}