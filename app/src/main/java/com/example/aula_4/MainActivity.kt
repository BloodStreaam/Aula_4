package com.example.aula_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val PARAM_NAME = "nome"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Formulário")
    }

    fun changeName(view: View) {
        val editText = findViewById<EditText>(R.id.et1)
        val textView = findViewById<TextView>(R.id.tv1)

        if(editText.text.toString() == ""){
            Toast.makeText(this, "Please write your name", Toast.LENGTH_SHORT).show()
        }else{
     //       textView.setText(editText.text)
        textView.text = editText.text
        }
    }

    fun goToNextPage(view: View) {
        val editText = findViewById<EditText>(R.id.et1)
        val intent = Intent(this, DashboardActivity::class.java).apply {
            putExtra(PARAM_NAME, editText.text.toString())
        }
        startActivity(intent)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater. inflate(R.menu.custom_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.item1 -> {
                Toast.makeText(this, "Item1 Selected", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.item2 -> {
                Toast.makeText(this, "Item2 Selected", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.subItem1 -> {
                Toast.makeText(this, "SubItem1 Selected", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}