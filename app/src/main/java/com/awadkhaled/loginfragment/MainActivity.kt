package com.awadkhaled.loginfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.awadkhaled.loginfragment.databinding.ActivityMainBinding

const val EMAIL_KEY = "com.awadkhaled.loginfragment.email"
const val PASSWORD_KEY = "com.awadkhaled.loginfragment.password"

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonLogin.setOnClickListener {
            val intent = Intent(this, Destination::class.java).apply {
                putExtra(EMAIL_KEY, binding.email.text.toString().trim())
                putExtra(PASSWORD_KEY,binding.password.text.toString().trim())
            }
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        binding.email.setText("")
        binding.password.setText("")
    }
}