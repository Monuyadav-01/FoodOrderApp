package com.example.foodorderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.foodorderapp.databinding.ActivityLoginBinding
import com.example.foodorderapp.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val btnNext = binding.btnNext

        btnNext.setOnClickListener {
            val i = Intent(this, LoginActivity::class.java)
            startActivity(i)
        }

    }



}