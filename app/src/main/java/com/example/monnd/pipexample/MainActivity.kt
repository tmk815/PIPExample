package com.example.monnd.pipexample

import android.app.PictureInPictureParams
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Rational
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pipbutton.setOnClickListener {
            this.enterPictureInPictureMode(PictureInPictureParams.Builder().setAspectRatio(Rational(3,4)).build())
        }
    }
}
