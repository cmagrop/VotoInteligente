package com.example.votointeligente

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

data class UsuarioModel (

    @Expose
    @SerializedName("rut")
    val rut: String,

    @Expose
    @SerializedName("nombre")
    val nombre: String,

    @Expose
    @SerializedName("apellido1")
    val apellido1: String,

    @Expose
    @SerializedName("apellido2")
    val apellido2: String,

    @Expose
    @SerializedName("direccion")
    val direccion: String,

    @Expose
    @SerializedName("genero")
    val genero: Integer,

    @Expose
    @SerializedName("mesas")
    val mesas: Integer,

    @Expose
    @SerializedName("f_nacimiento")
    val f_nacimiento: Date,

    @Expose
    @SerializedName("e_civil")
    val e_civil: Integer,

    @Expose
    @SerializedName("email")
    val email: String,

    @Expose
    @SerializedName("password")
    val password: String,

    @Expose
    @SerializedName("nro_documento")
    val nro_documento: Integer,

    @Expose
    @SerializedName("es_administrador")
    val es_administrador: Integer



)




