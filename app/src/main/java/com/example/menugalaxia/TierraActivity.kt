package com.example.menugalaxia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TierraActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tierra)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        val txtTierra = findViewById<TextView>(R.id.txtTierra)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnRegresar.setOnClickListener {
            //startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

//        txtTierra.setOnClickListener {
//            startActivity(Intent(this, MainActivity::class.java))
//        }
    }
}