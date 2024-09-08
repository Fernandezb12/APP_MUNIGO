package com.sena.munigo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Oculta la barra de acción si está presente
        supportActionBar?.hide()

        // Retrasa la transición a la actividad principal
        Handler(Looper.getMainLooper()).postDelayed({
            // Crea un Intent para abrir la actividad principal
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000) // 2000 ms = 2 segundos
    }
}