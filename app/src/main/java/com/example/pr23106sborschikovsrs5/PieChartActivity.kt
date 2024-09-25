package com.example.pr23106sborschikovsrs5

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout

class PieChartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        createPieChart()
    }

    private fun createPieChart() {
        val series = CategorySeries("Series")
        series.add("Category 1", 10)
        series.add("Category 2", 20)
        series.add("Category 3", 30)

        val renderer = DefaultRenderer()
        renderer.legendTextSize = 30
        renderer.labelsTextSize = 20

        val chart = ChartFactory.getPieChartView(this, series, renderer)

        val layout = LinearLayout(this)
        layout.addView(chart)

        setContentView(layout)
    }

    class ChartFactory {
        private  fun getPieChartView(series: CategorySeries, renderer: DefaultRenderer){

        }

        companion object {
            fun getPieChartView(
                pieChartActivity: PieChartActivity,
                series: CategorySeries,
                renderer: DefaultRenderer
            ): View? {
                TODO("Not yet implemented")
            }
        }
    }

    class CategorySeries(s: String) {

    }
}

private fun Any.add(s: String, i: Int) {
    TODO("Not yet implemented")
}

class DefaultRenderer {

    var legendTextSize: Int = 0
    var labelsTextSize: Int = 0
}
