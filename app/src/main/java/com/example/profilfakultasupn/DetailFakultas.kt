package com.example.profilfakultasupn

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.datail_fakultas.*

class DetailFakultas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.datail_fakultas)

        var intentThatStartedThisActivity = intent

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {

            showContent(intentThatStartedThisActivity)
        }
    }

    private fun showContent(intentThatStartedThisActivity: Intent) {
        var nameF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INTENT)
        var deskF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
        var deskS = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
        var imgF = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
        var emailF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_EMAIL)
        var webF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_ORIGINATING_URI)

        tv_name_detail.text = nameF
        tv_desc_detail.text = deskF
        tv_short_detail.text = deskS
        image_detail.contentDescription = nameF
        image_detail.setImageResource(imgF)

        if (emailF == "") {
            tv_link_email.text = ""
            tv_email_detail.text = ""
        } else {
            tv_link_email.text = emailF
        }
        if (webF == "") {
            tv_link_web.text = ""
            tv_website_detail.text = ""
        } else {
            tv_link_web.text = webF
        }

        tv_link_email.setOnClickListener {
            //Jalankan function klikWeb dengan parameter partWeb
            clickEmail(emailF.toString())
        }

        tv_link_web.setOnClickListener {
            //Jalankan function klikWeb dengan parameter partWeb
            clickWeb(webF.toString())
        }
    }

    private fun clickEmail(email: String) {
        // Intent Send for call 3rd application in your device
        val mailIntent = Intent(Intent.ACTION_SEND)

        // Component for email
        mailIntent.data = Uri.parse("mailto:")
        mailIntent.type = "text/plain"

        // Penerima menggunakan array, karena emaiil dikirim ke beberapa penerima
        mailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))

        // For Subject
        mailIntent.putExtra(Intent.EXTRA_SUBJECT, "From Faculty Profile Ver 2")

        // For Isi Email
        mailIntent.putExtra(Intent.EXTRA_TEXT, "Attention")

        startActivity(Intent.createChooser(mailIntent, "Choose Email..."))

    }

    private fun clickWeb(url: String) {

        val showWebActivity = Intent(this, WebFakultas::class.java)
        //Kiriman Intent
        showWebActivity.putExtra(Intent.ACTION_VIEW, url)

        // Menjalankan Activity FakultasWeb dengan Intent
        startActivity(showWebActivity)

    }
}