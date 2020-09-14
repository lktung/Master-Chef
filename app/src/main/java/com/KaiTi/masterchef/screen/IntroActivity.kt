package com.KaiTi.masterchef.screen

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.KaiTi.masterchef.R
import com.KaiTi.masterchef.screen.main.MainActivity

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val intent = Intent(this, MainActivity::class.java)
        TimeCounter(intent)
    }

    fun TimeCounter(intent: Intent) {
        object : CountDownTimer(1500, 1000) {
            override fun onFinish() {
                startActivity(intent)
            }

            override fun onTick(p0: Long) {}
        }.start()
    }
}
