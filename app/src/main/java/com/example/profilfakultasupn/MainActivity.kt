package com.example.profilfakultasupn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = CreateFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = AdapterFakultas(data, { onItem: DataFakultas -> onItemClicked(onItem) })
    }

    private fun onItemClicked(onItem: DataFakultas) {
        val showDetailActivityIntent = Intent(this, DetailFakultas::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descDet)
        showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, onItem.emailFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_ORIGINATING_URI, onItem.webFac)
        startActivity(showDetailActivityIntent)
    }

}
