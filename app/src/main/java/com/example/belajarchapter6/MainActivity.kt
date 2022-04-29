package com.example.belajarchapter6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.belajarchapter6.PertemuanKeduan.PertemuanKeduaActivity
import com.example.belajarchapter6.PertemuanKeempat.PertemuanKeempatActivity
import com.example.belajarchapter6.PertemuanKetiga.PertemuanKetigaActivity
import com.example.belajarchapter6.PertemuanPertama.PertemuanPertamaActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contohThreadSatu()
        persatu.setOnClickListener {
            startActivity(Intent(this, PertemuanPertamaActivity::class.java))
        }

        kedua.setOnClickListener {
            startActivity(Intent(this, PertemuanKeduaActivity::class.java))
        }

        ketiga.setOnClickListener {
            startActivity(Intent(this, PertemuanKetigaActivity::class.java))
        }

        keempat.setOnClickListener {
            startActivity(Intent(this, PertemuanKeempatActivity::class.java))
        }
    }

    fun contohThreadSatu(){
        Thread(Runnable {
            btn_satu.setOnClickListener {
                tv_satu.post(Runnable { tv_satu.text = "Hello Binar Academy" })
            }
            tv_satu.post(Runnable { tv_satu.text = "Hello World" })
            tv_dua.postDelayed(Runnable { tv_dua.text = "Welcome Lukman" }, 2000)
//            tv_dua.text = "welcome Luk"
        }).start()
    }

    fun contohHandler(){
        val handler = object : Handler(Looper.getMainLooper()){

        }
    }

}