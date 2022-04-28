package com.example.belajarchapter6.PertemuanKetiga.Receiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter6.R

class ReceiverActivity : AppCompatActivity() {

    lateinit var receiver : AirplanModeReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver)
        receiver = AirplanModeReceiver()
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver, it)
        }
    }
}