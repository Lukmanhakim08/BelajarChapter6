package com.example.belajarchapter6.PertemuanKeempat.MVP.Presenter

import com.example.belajarchapter6.PertemuanKeempat.MVP.Model.HasilPL

class PersegiPanjangPresenter(var pview : PersegiPanjangView ) {

    fun hitung(panjang : Int, lebar: Int){
        val totalpp = panjang * lebar
        val count = HasilPL()
        count.total = totalpp

        pview.hasil(count)
    }
}