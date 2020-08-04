package com.example.votointeligente

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
    }
    fun capturaLogin(v: View){
        //creacion de objeto usuario y conexion(?) con el campo en el xml
        val usuario=findViewById<EditText>(R.id.login_edt_usuario)
        val passwrod=findViewById<EditText>(R.id.login_edt_pass)
        //conversion del campo EditText a string mediante el objeto creado
        val user=usuario.text.toString()
        val pass=passwrod.text.toString()

        if (user.isEmpty())
            Toast.makeText(this,"something something", Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this,"not something", Toast.LENGTH_LONG).show()
        if (pass.isEmpty())
            Toast.makeText(this,"something something 2", Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this,"not something 2", Toast.LENGTH_LONG).show()
    }




}