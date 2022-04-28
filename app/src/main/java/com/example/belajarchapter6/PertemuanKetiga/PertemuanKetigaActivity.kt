package com.example.belajarchapter6.PertemuanKetiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter6.PertemuanKetiga.Receiver.ReceiverActivity
import com.example.belajarchapter6.PertemuanKetiga.Services.ServiceActivity
import com.example.belajarchapter6.R
import kotlinx.android.synthetic.main.activity_pertemuan_ketiga.*

class PertemuanKetigaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertemuan_ketiga)

        btn_services.setOnClickListener {
            startActivity(Intent(this, ServiceActivity::class.java))
        }

        btn_receiver.setOnClickListener {
            startActivity(Intent(this, ReceiverActivity::class.java))
        }
    }
}