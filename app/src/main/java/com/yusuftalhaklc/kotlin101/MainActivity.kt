package com.yusuftalhaklc.kotlin101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var diceBtn : Button =  findViewById(R.id.diceButton)
        var diceIm : ImageView = findViewById(R.id.imageView)


        diceBtn.setOnClickListener {

            var randomNumber = (1..6).random()
            when(randomNumber) {
                1 -> diceIm.setImageResource(R.drawable.dice_1)
                2 -> diceIm.setImageResource(R.drawable.dice_2)
                3 -> diceIm.setImageResource(R.drawable.dice_3)
                4 -> diceIm.setImageResource(R.drawable.dice_4)
                5 -> diceIm.setImageResource(R.drawable.dice_5)
                6 -> diceIm.setImageResource(R.drawable.dice_6)
            }

        }

    }

}