package com.example.belajarchapter6.PertemuanKeempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter6.PertemuanKeempat.LatihanMVP.View.HitungBBActivity
import com.example.belajarchapter6.PertemuanKeempat.MVP.View.MainBangunActivity
import com.example.belajarchapter6.R
import kotlinx.android.synthetic.main.activity_pertemuan_keempat.*

class PertemuanKeempatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertemuan_keempat)


        btn_ctsatu.setOnClickListener {
            startActivity(Intent(this, MainBangunActivity::class.java))
        }

        bt_bb.setOnClickListener {
            startActivity(Intent(this, HitungBBActivity::class.java))
        }
    }
}