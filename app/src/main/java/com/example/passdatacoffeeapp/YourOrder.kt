package com.example.passdatacoffeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_your_order.*

class YourOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_order)

        val orderCustomer =intent.getStringExtra(MainActivity.KEY)
        TVOrder.text= "Your Order is \n "+orderCustomer.toString()
    }
}