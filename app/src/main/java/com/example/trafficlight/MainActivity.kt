package com.example.trafficlight

import android.annotation.SuppressLint
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    @SuppressLint("ResourceType")
    fun SwitchClick(view: View)
    {
        val redColor = findViewById<ImageView>(R.id.RedLight)
        val orangeColor = findViewById<ImageView>(R.id.OrangeLight)
        val greenColor = findViewById<ImageView>(R.id.GreenLight)
        val orangeColorGreen = findViewById<ImageView>(R.id.OrangeLightGreen)


        if (redColor.visibility == View.VISIBLE)
        {
            redColor.visibility = View.INVISIBLE
            orangeColorGreen.visibility = View.VISIBLE
        }
        else if(orangeColorGreen.visibility == View.VISIBLE)
        {
            orangeColorGreen.visibility = View.INVISIBLE
            greenColor.visibility = View.VISIBLE
        }
        else if (greenColor.visibility == View.VISIBLE )
        {
            greenColor.visibility = View.INVISIBLE
            orangeColor.visibility = View.VISIBLE
        }
        else if(orangeColor.visibility == View.VISIBLE)
        {
            redColor.visibility = View.VISIBLE
            orangeColor.visibility = View.INVISIBLE
        }


    }
}





class v {

}
