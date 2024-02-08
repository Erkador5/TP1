package ca.ulaval.ima.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class SiteWebWVActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_site_web_wv)

        val urlToLoad = intent.getStringExtra("urlToLoad")

        val webViewSiteWeb: WebView = findViewById(R.id.webViewSiteWeb)
        webViewSiteWeb.webViewClient = WebViewClient()
        webViewSiteWeb.loadUrl(urlToLoad!!)

        val buttonFermer = findViewById<Button>(R.id.buttonFermer)
        buttonFermer.setOnClickListener {
            finish()
        }
    }
}