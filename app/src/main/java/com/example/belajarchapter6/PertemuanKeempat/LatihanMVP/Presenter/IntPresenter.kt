package com.example.belajarchapter6.PertemuanKeempat.LatihanMVP.Presenter

import com.example.belajarchapter6.PertemuanKeempat.LatihanMVP.Model.DataImt

class IntPresenter(var int : intInterface) {
    fun hasilint (tinggi : Double, berat: Double){
        val inthitung = berat/ (tinggi*tinggi)
        val count = DataImt()
        count.hasilimit = inthitung.toDouble()

        int.hasil(count)
    }
}