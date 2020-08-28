package com.example.votointeligente

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class VotacionesModel(

    @Expose
    @SerializedName("nro_votacion")
    val nro_votacion: Integer,

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


