package com.example.ruangabsen.views.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ruangabsen.R
import com.example.ruangabsen.databinding.ActivityLoginBinding
import com.example.ruangabsen.views.main.MainActivity
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_login)
        setContentView(binding.root)

        onClick()
    }

    private fun onClick() {
        binding.btnLogin.setOnClickListener {
            startActivity<MainActivity>()
        }
    }
}