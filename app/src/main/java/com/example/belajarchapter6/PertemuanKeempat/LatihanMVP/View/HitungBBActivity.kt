package com.example.belajarchapter6.PertemuanKeempat.LatihanMVP.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.belajarchapter6.PertemuanKeempat.LatihanMVP.Model.DataImt
import com.example.belajarchapter6.PertemuanKeempat.LatihanMVP.Presenter.IntPresenter
import com.example.belajarchapter6.PertemuanKeempat.LatihanMVP.Presenter.intInterface
import com.example.belajarchapter6.PertemuanKeempat.MVP.Presenter.PersegiPanjangPresenter
import com.example.belajarchapter6.R
import kotlinx.android.synthetic.main.activity_hitung_bbactivity2.*

class HitungBBActivity : AppCompatActivity(), intInterface {

    private var present : IntPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_bbactivity2)
        present = IntPresenter(this)

        btnhtunganbb.setOnClickListener {
            val bb = edtbrt.text.toString().toDouble()
            val tt = edttng.text.toString().toDouble()
            present!!.hasilint(tt,bb)
        }

    }

    override fun hasil(result: DataImt) {
        Toast.makeText(this, result.hasilimit.toString(), Toast.LENGTH_SHORT).show()
    }
}