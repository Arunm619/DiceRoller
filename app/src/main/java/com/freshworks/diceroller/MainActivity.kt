package com.freshworks.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var rollemeButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.iv_dice)
        rollemeButton = findViewById(R.id.btn_roll_me)

        rollemeButton.setOnClickListener{
            //Toast.makeText(this,"That's how I roll.",Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val randomNumber =  Random(System.currentTimeMillis()).nextInt(6) + 1
        val resource =   when(randomNumber)
        {
            1 -> R.drawable.dice_1
            2-> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        diceImage.setImageResource(resource)
       // Toast.makeText(this,"That's how I roll.",Toast.LENGTH_SHORT).show()
    }
}
