package com.example.ruangabsen.views.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.ruangabsen.R
import com.example.ruangabsen.views.login.LoginActivity
import org.jetbrains.anko.startActivity

class SplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        afterDelayGoToLogin()
    }

    private fun afterDelayGoToLogin() {
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity<LoginActivity>()
            finishAffinity()
        },1200)
    }
}