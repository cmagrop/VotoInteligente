package com.example.votointeligente

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RespuestaVotacionModel (

    @Expose
    @SerializedName("id_respuesta")
    val id_respuesta: Integer,

    @Expose
    @SerializedName("apruebo")
    val apruebo: Integer,

    @Expose
    @SerializedName("rechazo")
    val rechazo: Integer,

    @Expose
    @SerializedName("abstengo")
    val abstengo: Integer,

    @Expose
    @SerializedName("nulo")
    val nulo: Integer,

    @Expose
    @SerializedName("blanco")
    val blanco: Integer


)


