package com.cs.po

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginCodeInput = findViewById<EditText>(R.id.loginCodeInput)
        val button = findViewById<Button>(R.id.openIntentButton)


        button.setOnClickListener {
            val loginCode = loginCodeInput.text.toString()

            val uriStr = "ccusafe://open?porteo_login_code=$loginCode"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uriStr))
            startActivity(intent)
        }
    }
}