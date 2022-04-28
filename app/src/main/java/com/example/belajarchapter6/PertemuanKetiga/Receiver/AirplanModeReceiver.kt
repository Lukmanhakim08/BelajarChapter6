package com.example.belajarchapter6.PertemuanKetiga.Receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplanModeReceiver : BroadcastReceiver(){

    override fun onReceive(p0: Context?, p1: Intent?) {
        val modepengembang = p1?.getBooleanExtra("state", false)
        if (modepengembang == true){
            Toast.makeText(p0, "Mode Pengembang aktif", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(p0, "Mode Pengembang tidak aktif", Toast.LENGTH_SHORT).show()
        }
    }
}