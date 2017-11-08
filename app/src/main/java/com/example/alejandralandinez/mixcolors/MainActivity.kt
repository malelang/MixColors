package com.example.alejandralandinez.mixcolors

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ch_amarillo.setOnClickListener(this::changeColor)
        ch_azul.setOnClickListener(this::changeColor)
        ch_red.setOnClickListener(this::changeColor)

    }

    fun changeColor(view: View){

        if(ch_amarillo.isChecked) {

            if (ch_azul.isChecked && !ch_red.isChecked) img.setImageResource(R.drawable.icongreen)
            else if (ch_red.isChecked && !ch_azul.isChecked) img.setImageResource(R.drawable.iconorange)
            else if (ch_red.isChecked && ch_azul.isChecked) img.setImageResource(R.drawable.iconwhite)
            else {img.setImageResource(R.drawable.iconyellow)}
        }
        else if(ch_azul.isChecked) {

            if (ch_amarillo.isChecked && !ch_red.isChecked) img.setImageResource(R.drawable.icongreen)
            else if (ch_red.isChecked && !ch_amarillo.isChecked) img.setImageResource(R.drawable.iconpurple)
            else if (ch_amarillo.isChecked && ch_red.isChecked) img.setImageResource(R.drawable.iconwhite)
            else {img.setImageResource(R.drawable.iconblue)}
        }
        else if(ch_red.isChecked) {

            if (ch_azul.isChecked && !ch_amarillo.isChecked) img.setImageResource(R.drawable.iconpurple)
            else if (ch_amarillo.isChecked && !ch_azul.isChecked) img.setImageResource(R.drawable.iconorange)
            else if (ch_amarillo.isChecked && ch_red.isChecked) img.setImageResource(R.drawable.iconwhite)
            else {img.setImageResource(R.drawable.iconred)}
        }
        else  img.setImageResource(R.drawable.iconblack)
        }
    }

