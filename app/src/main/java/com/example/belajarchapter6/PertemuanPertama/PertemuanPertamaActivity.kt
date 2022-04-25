package com.example.belajarchapter6.PertemuanPertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter6.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_pertemuan_pertama.*

class PertemuanPertamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertemuan_pertama)
        threat()
    }

    fun threat(){
        Thread(Runnable {
            btnhitung.setOnClickListener {
                val nama = edtnama.text.toString()
                val umur = edtumur.text.toString()
                val hasil = 2022 - umur.toInt()

                txtresult.post(Runnable {
                    txtresult.text = nama
                })
                txtumur.post(Runnable {
                    txtumur.text = hasil.toString()
                })
            }
        }).start()
    }
}