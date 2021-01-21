package com.kanyideveloper.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roll: Button = findViewById(R.id.buttonRoll)

        roll.setOnClickListener { rollDice() }
    }

    private fun rollDice(){
        val dice = Dice(6)
        val diceValue = dice.roll()
        val diceImage: ImageView = findViewById(R.id.diceImageView)


        if (diceValue == 1){
            diceImage.setImageResource(R.drawable.dice_1)
        }
        else if (diceValue == 2){
            diceImage.setImageResource(R.drawable.dice_2)
        }
        else if (diceValue == 3){
            diceImage.setImageResource(R.drawable.dice_3)
        }
        else if (diceValue == 4){
            diceImage.setImageResource(R.drawable.dice_4)
        }
        else if (diceValue == 5){
            diceImage.setImageResource(R.drawable.dice_5)
        }
        else if (diceValue == 6){
            diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}

class Dice(val num: Int){

    fun roll() : Int{
        return (1..num).random()
    }
}

