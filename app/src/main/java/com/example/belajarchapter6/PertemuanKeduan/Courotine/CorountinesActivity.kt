package com.example.belajarchapter6.PertemuanKeduan.Courotine

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.belajarchapter6.R
import kotlinx.android.synthetic.main.activity_corountines.*
import kotlinx.coroutines.*

class CorountinesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corountines)
        contohCorountine()

    }

    fun contohCorountine(){
        GlobalScope.launch {
            CoroutineScope(Dispatchers.Main).launch {
                tvtest.text = dotext()
                bthitung.setOnClickListener {
                    val b = ettbb.text.toString().toDouble()
                    val t = ettinggi.text.toString().toDouble()
                    val h = b/(t*t)
                    if (h < 18.5){
                        tvresult.text = "Berat Badan Anda Kurus"
                    }else if (h>18.5 && h<24.9){
                        tvresult.text = "Berat Badan Anda Normal"
                    }else if (h>25 && h<29.9){
                        tvresult.text = "Berat Badan Anda Overweight"
                    }else if (h>=30){
                        tvresult.text = "Berat Badan Anda Obesitas"
                    }
                }
            }
            CoroutineScope(Dispatchers.IO).launch {
                Log.d(TAG, "dispather IO")
            }

            CoroutineScope(Dispatchers.Default).launch {
                Log.d(TAG, "Default")
            }
        }
    }

    suspend fun dotext(): String{
        return "hello Binar"
    }

}