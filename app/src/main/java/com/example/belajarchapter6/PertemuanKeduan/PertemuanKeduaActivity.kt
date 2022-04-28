package com.example.belajarchapter6.PertemuanKeduan

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter6.PertemuanKeduan.Courotine.CorountinesActivity
import com.example.belajarchapter6.R
import kotlinx.android.synthetic.main.activity_pertemuan_kedua.*

class PertemuanKeduaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertemuan_kedua)

        asyntaks.setOnClickListener {
            startActivity(Intent(this, AsynTaskActivity::class.java))
        }

        latihanmin.setOnClickListener {
            startActivity(Intent(this, LatihanAsyntaskActivity::class.java))
        }

        coroutines.setOnClickListener {
            startActivity(Intent(this, CorountinesActivity::class.java))
        }
    }

}