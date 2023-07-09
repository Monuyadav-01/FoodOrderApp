package com.example.foodorderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodorderapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
   private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signUpBtn.setOnClickListener {
            val i=Intent(this, SignUpActivity::class.java)
            startActivity(i)
        }
        binding.loginBtn.setOnClickListener {
            val i=Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()
        }

    }
}