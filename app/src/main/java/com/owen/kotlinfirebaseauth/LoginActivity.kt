package com.owen.kotlinfirebaseauth

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    val mAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        val loginButton = findViewById<View>(R.id.loginBtn) as Button

        loginButton.setOnClickListener(View.OnClickListener {

             View ->  login()
        })

       
    }
     private fun login()
    {

    }
}
