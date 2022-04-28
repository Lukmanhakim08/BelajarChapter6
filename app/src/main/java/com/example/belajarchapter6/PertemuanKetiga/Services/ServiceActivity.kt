package com.example.belajarchapter6.PertemuanKetiga.Services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter6.R
import kotlinx.android.synthetic.main.activity_service.*

class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        btplay.setOnClickListener {
            startService(Intent(this, ServicePlayer::class.java))
        }

        btstop.setOnClickListener {
            stopService(Intent(this, ServicePlayer::class.java))
        }
    }
}