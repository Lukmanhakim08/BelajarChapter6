package com.example.belajarchapter6.PertemuanKeempat.MVP.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.belajarchapter6.PertemuanKeempat.MVP.Model.HasilPL
import com.example.belajarchapter6.PertemuanKeempat.MVP.Presenter.PersegiPanjangPresenter
import com.example.belajarchapter6.PertemuanKeempat.MVP.Presenter.PersegiPanjangView
import com.example.belajarchapter6.R

class MainBangunActivity : AppCompatActivity(), PersegiPanjangView {

    private var presenter : PersegiPanjangPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_bangun)

        presenter = PersegiPanjangPresenter(this)

        presenter!!.hitung(10,5)
    }

    override fun hasil(hasil: HasilPL) {
        Toast.makeText(this, hasil.total.toString(), Toast.LENGTH_SHORT).show()
    }
}