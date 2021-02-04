package com.ilv.cahierdescharges

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.ActivityNavigator
import com.ilv.cahierdescharges.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val actionBar = supportActionBar

        actionBar!!.title = "Cahier des charges"

        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}