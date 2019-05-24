package com.owen.kotlinfirebaseauth

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.View

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    val btnRegister = findViewById<View>(R.id.btnRegister) as Button

        btnRegister.setOnClickListener(View.OnClickListener {
            v: View? ->  registerUser()
        })

    }

    private fun registerUser()
    {
         val userEmail = findViewById<View>(R.id.etEmail) as EditText
        val userPassword = findViewById<View>(R.id.etPassWord) as EditText
        val userName = findViewById<View >(R.id.etUserName) as EditText

        val email = userEmail.text.toString()
        val name = userName.text.toString()
        val password = userPassword.text.toString()
    }
}
