package com.example.trafficlight

import android.annotation.SuppressLint
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import java.io.Console

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var counter:Int =0

    @SuppressLint("ResourceType")
    fun SwitchClick(view: View)
    {
        val redColor = findViewById<ImageView>(R.id.RedLight)
        val orangeColor = findViewById<ImageView>(R.id.OrangeLight)
        val greenColor = findViewById<ImageView>(R.id.GreenLight)
       // val orangeColorGreen = findViewById<ImageView>(R.id.OrangeLightGreen)

        if (redColor.visibility == View.VISIBLE )
        {
            counter = 0
            redColor.visibility = View.INVISIBLE
            orangeColor.visibility = View.VISIBLE

        }
        else if(orangeColor.visibility == View.VISIBLE && counter == 0)
        {
            orangeColor.visibility = View.INVISIBLE
            greenColor.visibility = View.VISIBLE
        }
        else if (greenColor.visibility == View.VISIBLE)
        {
            counter = 1
            greenColor.visibility = View.INVISIBLE
            orangeColor.visibility = View.VISIBLE
        }
        else if(orangeColor.visibility == View.VISIBLE && counter == 1)
        {
            redColor.visibility = View.VISIBLE
            orangeColor.visibility = View.INVISIBLE
        }


    }
}





class v {

}
