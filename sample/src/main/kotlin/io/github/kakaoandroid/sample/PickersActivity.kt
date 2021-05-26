package io.github.kakaoandroid.sample

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.TextView
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity

class PickersActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pickers)

        findViewById<View>(R.id.select_date).setOnClickListener {
            DatePickerDialog(this, this, 1985, 10, 23).show()
        }

        findViewById<View>(R.id.select_time).setOnClickListener {
            TimePickerDialog(this, this, 1, 21, true).show()
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        findViewById<TextView>(R.id.date_field).text = "$dayOfMonth ${month + 1} $year"
    }

    @SuppressLint("SetTextI18n")
    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        findViewById<TextView>(R.id.time_field).text = "$hourOfDay:$minute"
    }
}
