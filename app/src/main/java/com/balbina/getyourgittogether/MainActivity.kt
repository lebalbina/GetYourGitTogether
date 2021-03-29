package com.balbina.getyourgittogether

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val messagesViewModel : MessagesViewModel = MessagesViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            messagesViewModel.showMessage(getString(R.string.toast_btn_1), this)
        }

        btn2.setOnClickListener {
            messagesViewModel.showMessage(getString(R.string.toast_btn_2), this)
        }

        btn3.setOnClickListener {
            messagesViewModel.showMessage(getString(R.string.toast_btn_3), this)
        }
    }
}