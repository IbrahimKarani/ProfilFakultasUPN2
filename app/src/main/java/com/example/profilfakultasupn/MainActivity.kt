package com.example.profilfakultasupn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = AdapterFakultas(data, { onItem: DataFakultas -> onItemClicked(onItem) })
    }

    private fun onItemClicked(onItem: DataFakultas) {
        val showDetailActivityIntent = Intent(this, DetailFakultas::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descDet)
        startActivity(showDetailActivityIntent)
    }

    private fun createFac(): List<DataFakultas> {
        val rvList = ArrayList<DataFakultas>()
        rvList.add(
            DataFakultas(
                R.drawable.logo_upn,
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer adalah satu dari 7\n" +
                        "Fakultas di UPN VETERAN JATIM.\n" +
                        "Yang terdiri dari prodi : ",
                "1. Teknik Informatika\n" +
                        "2. Sistem Informasi\n" +
                        "3. Sains Data"
            )
        )
        rvList.add(
            DataFakultas(
                R.drawable.logo_upn,
                "Fakultas Teknik",
                "Fakultas Teknik adalah satu dari 7\n" +
                        "Fakultas di UPN VETERAN JATIM.\n" +
                        "Yang terdiri dari prodi : ",
                "1. Teknik Kimia\n" +
                        "2. Teknik Industri\n" +
                        "3. Teknik Sipil\n" +
                        "4. Teknik Lingkungan\n" +
                        "5. Teknologi Pangan"
            )
        )
        rvList.add(
            DataFakultas(
                R.drawable.logo_upn,
                "Fakultas Ekonomi dan Bisnis",
                "Fakultas Ekonomi dan Bisnis adalah\n" +
                        "satu dari 7 Fakultas di UPN VETERAN \n" +
                        "Jawa Timur.\n" +
                        "Yang terdiri dari prodi : ",
                "1. Ekonomi Pembangunan\n" +
                        "2. Manajemen\n" +
                        "3. Akuntansi"
            )
        )
        rvList.add(
            DataFakultas(
                R.drawable.logo_upn,
                "Fakultas Pertanian",
                "Fakultas Pertanian adalah satu dari 7\n" +
                        "Fakultas di UPN VETERAN JATIM.\n" +
                        "Yang terdiri dari prodi : ",
                "1. Agroteknologi\n" +
                        "2. Agribisnis"
            )
        )
        rvList.add(
            DataFakultas(
                R.drawable.ibrahim,
                "Profil Perancang",
                "Nama : Ibrahim\n" +
                        "TTL : Pasuruan, 29 Juni 2000\n" +
                        "Address : Pasuruan, Bangil\n" +
                        "Phone Number : 089699373692\n" +
                        "Email : elaimbarca5@gmail.com\n" +
                        "GitHub : https://github.com/IbrahimKarani\n",
                "Riwayat Pendidikan : \n" +
                        "\t\t 1. SDN Bendomungal 1 Bangil \n" +
                        "\t\t 2. SMP Yadika Bangil \n" +
                        "\t\t 3. SMA Yadika Bangil"
            )
        )
        return rvList
    }
}
