package com.ardadeniz.assignment4

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    val c: Calendar = Calendar.getInstance()
    var year: Int = c.get(Calendar.YEAR)
    var month: Int = c.get(Calendar.MONTH)
    var day: Int = c.get(Calendar.DAY_OF_MONTH)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun press(view: View){
        val textView = findViewById<TextView>(R.id.textView4)
        val dpd = DatePickerDialog.OnDateSetListener { datePicker, y, m, d ->
            this.year = y
            this.month = m+1
            this.day = d
            textView.setText(""+y+"."+m+"."+d)
        }
        val datePicker = DatePickerDialog(this,dpd,year,month,day)
        datePicker.show()
    }
}



