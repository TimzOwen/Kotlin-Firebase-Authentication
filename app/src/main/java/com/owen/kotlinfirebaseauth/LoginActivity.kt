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
          val emailIds = findViewById<View>( R.id.etName) as EditText
        val passwordIDs = findViewById<View>(R.id.etPassWord) as EditText

        val emailCollection = emailIds.text.toString()
        val passwordColection = passwordIDs.text.toString()

        if(!emailCollection.isEmpty() && (passwordColection.isEmpty()))
        {
            mAuth.signInWithEmailAndPassword(emailCollection, passwordColection).addOnCompleteListener(this, OnCompleteListener { 
                task ->
                if (task.isSuccessful)
                {
                    startActivity(Intent(this, MainActivity :: class.java))
                }
            })
        }
        else
        {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_LONG).show()
        }

    }
}
