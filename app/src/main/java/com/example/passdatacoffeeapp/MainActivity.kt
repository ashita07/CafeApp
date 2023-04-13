package com.example.passdatacoffeeapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //static keyword in java allows us to call any method without creating an object of it
    //in kotlin (companion object)is equivalent to static in java
    //it means a method should be static to be called directly

    //creating key
    companion object {
        const val KEY ="com.example.passdatacoffeeapp.MainActivity.KEY"

    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            val orderList1 = editText1.text.toString() +" " + editText2.text.toString()+" " +
            editText3.text.toString()

        intent = Intent(this,YourOrder::class.java)
            //Ctrl+p for getting different parameters inside a method
            //key value pair dena hai method ke andar
            intent.putExtra(KEY,orderList1)

            startActivity(intent)
        }
    }
}