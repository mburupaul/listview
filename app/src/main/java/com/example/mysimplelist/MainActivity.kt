package com.example.mysimplelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView=findViewById<ListView>(R.id.list)
        val names= arrayOf("Florentina Shakes","Sandra Kaimuri","Timmy Onduso","Peter wanjohi")
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
        listView.adapter=arrayAdapter
        listView.setOnItemClickListener { adapterView, view, position, l ->

            Toast.makeText(this, "You have clicked on"+names[position], Toast.LENGTH_LONG).show()
        }
    }

}
