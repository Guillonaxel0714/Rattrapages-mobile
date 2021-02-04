package com.ilv.cahierdescharges

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val actionBar = supportActionBar

        actionBar!!.title = "Cahier des charges"

        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}