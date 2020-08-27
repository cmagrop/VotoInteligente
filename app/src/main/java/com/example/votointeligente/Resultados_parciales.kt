package com.example.votointeligente

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.utils.ColorTemplate
import java.util.*
import kotlin.collections.ArrayList


class Resultados_parciales : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados_parciales)
        //barras()
        circular()
    }

    private fun circular() {
        val grafico : PieChart = findViewById(R.id.grafico)
        var lista = ArrayList<PieEntry>()

        lista.add(PieEntry(530.toFloat(), "apruebo"))
        lista.add(PieEntry(429.toFloat(), "rechazo"))
        lista.add(PieEntry(125.toFloat(), "blanco"))
        lista.add(PieEntry(232.toFloat(), "nulo"))


        val colors = ArrayList<Int>()
        for (c in ColorTemplate.COLORFUL_COLORS) colors.add(c)


        var dataSet = PieDataSet(lista, "Grafico circular")
        dataSet.sliceSpace = 8f
        dataSet.valueTextSize = 12f
        dataSet.valueTextColor = Color.WHITE
        dataSet.setColors(colors)

        grafico.centerText = "Repoblacion de arboles en el centro de la ciudad"
        grafico.data = PieData(dataSet)
    }

    fun barras() {
        val grafico : BarChart = findViewById(R.id.grafico)
        var lista = ArrayList<BarEntry>()

        for (i in 0..10){
            var y =(Math.random() * 8) + 1
            lista.add(BarEntry(i.toFloat(), y.toFloat()))
        }

        var dataSet = BarDataSet(lista, "Grafico de Barras")
        grafico.data = BarData(dataSet)
    }

}