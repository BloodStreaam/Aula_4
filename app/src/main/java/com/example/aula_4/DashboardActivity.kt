package com.example.aula_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        setTitle("DashBoard")
        val parametro = intent.getStringExtra(PARAM_NAME)
        val textView = findViewById<TextView>(R.id.tv1Dashboard)

        textView.setText(parametro)
    }
}