package com.example.belajarchapter6.PertemuanKeduan.Courotine

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter6.R
import kotlinx.android.synthetic.main.activity_corountines.*
import kotlinx.coroutines.*

class CorountinesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corountines)

//        contohCorountine()
//        contohCorountine2()

        CoroutineScope(Dispatchers.Main).launch {
            contohCorountine2()
        }
    }

//    fun contoCoroutines(){
//        GlobalScope.launch {
//            delay(2000)
//            Log.d(TAG, "HEllo Lukman")
//            val a = async { getString("Hello Lukman") }
//            val hasil = a.await()
//        }
//    }
    fun contohCorountine(){
        GlobalScope.launch {
            delay(2000)
            tvtest.text = "Hello Lukman"
        }
    }


    fun contohCorountine2(){
        GlobalScope.launch {
            hasil()
        }
    }

//    private suspend fun getString(s: String):String{
//        delay(1000)
//        return s
//    }

    suspend fun hasil(): String{
        delay(2000)
        val a = tvtest.setText("Hello Binar")
        return a.toString()
    }
}