package com.example.belajarchapter6.PertemuanKeduan

import android.app.ProgressDialog
import android.content.Context
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter6.R
import kotlinx.android.synthetic.main.activity_latihan_asyntask.*


@Suppress ("DEPRETION")
class LatihanAsyntaskActivity : AppCompatActivity() {
    lateinit var cont : Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_asyntask)
        cont = this
        btnhitung.setOnClickListener {
            contohAsyntTask().execute()
        }
    }

    inner class contohAsyntTask : AsyncTask<Int, Void, String>() {

        lateinit var loading : ProgressDialog

        override fun onPreExecute() {
            super.onPreExecute()
            loading = ProgressDialog(cont)
            loading.show()
        }

        override fun doInBackground(vararg p0: Int?): String {
            val berat = edtbb.text.toString().toInt()
            val tinggi = edttinggi.text.toString().toFloat()
            val hasil = (berat/(tinggi*tinggi))
            var ouput = ""
            if (hasil < 18.5){
                ouput = "Berat Badan Anda Kurus"
            }else if (hasil>18.5 && hasil<24.9){
                ouput = "Berat Badan Anda Normal"
            }else if (hasil>25 && hasil<29.9){
                ouput = "Berat Badan Anda Overweight"
            }else if (hasil>=30){
                ouput = "Berat Badan Anda Obesitas"
            }
            return ouput
        }

        override fun onProgressUpdate(vararg values: Void?) {
            super.onProgressUpdate(*values)
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            tvTampil.text = result
            loading.dismiss()
            edtbb.setText("")
            edttinggi.setText("")
        }
    }
}