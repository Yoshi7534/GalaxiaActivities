package com.example.menugalaxia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SistemaSolarActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solar)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        val txtMercurio = findViewById<TextView>(R.id.txtMercurio)
        val txtVenus = findViewById<TextView>(R.id.txtVenus)
        val txtTierra = findViewById<TextView>(R.id.txtTierra)
        val txtMarte = findViewById<TextView>(R.id.txtMarte)
        val txtJupiter = findViewById<TextView>(R.id.txtJupiter)
        val txtSaturno = findViewById<TextView>(R.id.txtSaturn)
        val txtUrano = findViewById<TextView>(R.id.txtUran)
        val txtNeptuno = findViewById<TextView>(R.id.txtNeptune)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnRegresar.setOnClickListener {
            finish()
        }

        txtMercurio.setOnClickListener {
            startActivity(Intent(this, MercurioActivity::class.java))
        }
        txtVenus.setOnClickListener {
            startActivity(Intent(this, VenusActivity::class.java))
        }
        txtTierra.setOnClickListener {
            startActivity(Intent(this, TierraActivity::class.java))
        }
        txtMarte.setOnClickListener {
            startActivity(Intent(this, MarteActivity::class.java))
        }
        txtJupiter.setOnClickListener {
            startActivity(Intent(this, JupiterActivity::class.java))
        }
        txtSaturno.setOnClickListener {
            startActivity(Intent(this, SaturnoActivity::class.java))
        }
        txtUrano.setOnClickListener {
            startActivity(Intent(this, UranoActivity::class.java))
        }
        txtNeptuno.setOnClickListener {
            startActivity(Intent(this, NeptunoActivity::class.java))
        }

    }
}