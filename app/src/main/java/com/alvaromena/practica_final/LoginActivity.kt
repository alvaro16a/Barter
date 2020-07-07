package com.alvaromena.practica_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val datosRecibidos = intent.extras
        val correo = datosRecibidos?.getString("correo")
        val clave = datosRecibidos?.getString("clave")
        bt_nuevo_usuario.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java )
            startActivity(intent)
            onBackPressed()
        }

        bt_inicio_sesion.setOnClickListener {
            var clave_in=et_clave.text.toString()
            var correo_in=et_correo.text.toString()
            if (correo_in!=null && ((correo_in==correo) && (clave_in==clave)) && (clave_in!=null) ){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                tv_consola_login.text=getString(R.string.autentificacion_fallida)
            }

        }

    }
}