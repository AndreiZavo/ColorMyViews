package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val boxOneText: View = findViewById(R.id.box_one_text)
        val boxTwoText: View = findViewById(R.id.box_two_text)
        val boxThreeText: View = findViewById(R.id.box_three_text)
        val boxFourText: View = findViewById(R.id.box_four_text)
        val boxFiveText: View = findViewById(R.id.box_five_text)
        val constraintLayout : View = findViewById(R.id.constraint_layout)
        val redButton : View = findViewById(R.id.red_button)
        val greenButton : View = findViewById(R.id.green_button)
        val yellowButton : View = findViewById(R.id.yellow_button)

        val clickableViews : List<View> =
                listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, constraintLayout,
                    redButton, yellowButton, greenButton)
        for(item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.yellow_button -> findViewById<View>(R.id.box_five_text).setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> findViewById<View>(R.id.box_four_text).setBackgroundResource(R.color.my_green)
            R.id.red_button -> findViewById<View>(R.id.box_three_text).setBackgroundResource(R.color.my_red)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}