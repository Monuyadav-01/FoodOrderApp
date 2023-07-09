package com.example.foodorderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodorderapp.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val signUserName=binding.signupUserName
        val email=binding.SignUpEmail
        val password=binding.editTextTextPassword


        binding.signUp.setOnClickListener {
            val i=Intent(this, ChooseLocationActivity::class.java)
            startActivity(i)
        }
    }
}