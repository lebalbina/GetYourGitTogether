package com.balbina.getyourgittogether

import android.content.Context
import android.widget.Toast

class MessagesViewModel {
    fun showMessage(text: String, context: Context) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }
}