package com.example.dynamicedittextkotlin

//import android.os.Handler
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout)
        val fade_in:Button=findViewById<Button>(R.id.fade_in)
        val fade_out:Button=findViewById(R.id.fade_out)
        val zoom_in:Button=findViewById(R.id.zoom_in)
        val zoom_out:Button=findViewById(R.id.zoom_out)
        val textView:TextView=findViewById(R.id.textView)
        fade_in.setOnClickListener {
            textView.visibility = View.VISIBLE
            val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            textView.startAnimation(animationFadeIn)
        }
        fade_out.setOnClickListener {
            val animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            textView.startAnimation(animationFadeOut)
            Handler().postDelayed({
                textView.visibility = View.GONE
            }, 1000)
        }
        zoom_in.setOnClickListener {
            val animationZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            textView.startAnimation(animationZoomIn)
        }
        zoom_out.setOnClickListener {
            val animationZoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            textView.startAnimation(animationZoomOut)
        }
        val slide_down:Button=findViewById(R.id.slide_down)
        slide_down.setOnClickListener {
            val animationSlideDown = AnimationUtils.loadAnimation(this, R.anim.slide_in)
            textView.startAnimation(animationSlideDown)
        }
        val slide_up:Button=findViewById(R.id.slide_up)
        slide_up.setOnClickListener {
            val animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.slide_out)
            textView.startAnimation(animationSlideUp)
        }
        val bounce:Button=findViewById(R.id.bounce)
        bounce.setOnClickListener {
            val animationBounce = AnimationUtils.loadAnimation(this, R.anim.bounce)
            textView.startAnimation(animationBounce)
        }
        val rotate:Button=findViewById(R.id.rotate)
        rotate.setOnClickListener {
            val animationRotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
            textView.startAnimation(animationRotate)
        }
    }
}

