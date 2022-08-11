package com.example.zamin.notes.activitys.splashScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.zamin.notes.R
import com.example.zamin.notes.activitys.main.MainActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        object :CountDownTimer(1500,1500){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                startActivity(Intent(this@SplashScreen,MainActivity::class.java))
                finish()
            }
        }.start()
    }
}