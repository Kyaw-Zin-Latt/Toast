package com.example.toast


import android.os.Bundle
import android.widget.Toast
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.toast.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random as Random1


class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toastbutton: Button = findViewById(R.id.text_button)
        toastbutton.text = "Button"
        toastbutton.setOnClickListener {
            val positionToast = Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT)
            positionToast.show()
            positionToast.setGravity(Gravity.TOP,0,0)


            rollimage()
        }

        diceImage = findViewById(R.id.image_view)
    }

    private fun rollimage() {
        val randonInt = Random().nextInt(6) + 1
        val test = when (randonInt) {
            1 -> R.drawable.bitcoin
            2 -> R.drawable.bookmark
            3 -> R.drawable.bug
            4 -> R.drawable.chat
            5 -> R.drawable.date
            else -> R.drawable.contact
        }


        diceImage.setImageResource(test)



    }
}


