package com.awadkhaled.loginfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Destination : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination)

        val email = intent.getStringExtra(EMAIL_KEY)
        val password = intent.getStringExtra(PASSWORD_KEY)

        if (savedInstanceState == null) {
            val fragment = BlankFragment.newInstance(email,password)
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.fragmentContainerView,fragment)
            fragmentTransaction.commit()
        }
        findViewById<Button>(R.id.logout).setOnClickListener {
            finish()
        }
    }
}