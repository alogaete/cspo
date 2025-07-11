package com.cs.po

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginCodeInput = findViewById<EditText>(R.id.loginCodeInput)
        val button = findViewById<Button>(R.id.openIntentButton)
        val msgText = findViewById<TextView>(R.id.msg)

        button.setOnClickListener {
            val loginCode = loginCodeInput.text.toString()


            val uriStr = "ccusafe://open?porteo_login_code=$loginCode"
            msgText.text = "Sending: $uriStr"
            // show a toast or log the message
            Toast(this@MainActivity).apply {
                setText("Sending: $uriStr")
                show()
            }
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uriStr))
            startActivity(intent)
        }
    }
}