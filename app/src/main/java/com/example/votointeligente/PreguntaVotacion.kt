package com.example.votointeligente

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PreguntaVotacion (
    @Expose
    @SerializedName("id_pregunta")
    val id_pregunta: Integer,
    @Expose
    @SerializedName("enunciado")
    val enunciado: String,
    @Expose
    @SerializedName("detalle")
    val detalle: String,
    @Expose
    @SerializedName("FK_nro_votacion")
    val FK_nro_votacion: Integer,

    @Expose
    @SerializedName("FK_respuesta_votacion")
    val FK_respuesta_votacion: Integer

)