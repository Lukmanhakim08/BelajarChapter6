package com.example.belajarchapter6.PertemuanKeduan

import android.app.ProgressDialog
import android.content.Context
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarchapter6.R
import kotlinx.android.synthetic.main.activity_asyn_task.*

@Suppress ("DEPRETION")
class AsynTaskActivity : AppCompatActivity() {
    lateinit var cont : Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asyn_task)
        cont = this
        contohAsyntTask().execute()
    }


    inner class contohAsyntTask : AsyncTask<Int, Void, String>() {
        
        lateinit var loading : ProgressDialog

        override fun onPreExecute() {
            super.onPreExecute()
            loading = ProgressDialog(cont)
            loading.show()
        }

        override fun doInBackground(vararg p0: Int?): String {
            val count = 12 + 9
            return count.toString()
        }

        override fun onProgressUpdate(vararg values: Void?) {
            super.onProgressUpdate(*values)
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            tvsresult.text = result
            loading.dismiss()
        }
    }
}