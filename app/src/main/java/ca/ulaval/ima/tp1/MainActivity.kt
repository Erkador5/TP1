package ca.ulaval.ima.tp1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.Date

class MainActivity : AppCompatActivity() {
    private val urlToLoad: String = "https://www.google.com"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val monProfil = Profil(
            nom = "Jalbert Ross",
            prenom = "David",
            dateNaissance = Date(99, 7, 25),
            idul = "111269807"
        )

        val buttonSiteWebExt: Button = findViewById(R.id.buttonSiteWebExt)
        buttonSiteWebExt.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(urlToLoad))
            startActivity(intent)
        }

        val buttonSiteWebWV: Button = findViewById(R.id.buttonSiteWebWV)
        buttonSiteWebWV.setOnClickListener {
            val intent = Intent(this, SiteWebWVActivity::class.java)
            intent.putExtra("urlToLoad", urlToLoad)
            startActivity(intent)
        }

        val buttonULaval: Button = findViewById(R.id.buttonULaval)
        buttonULaval.setOnClickListener {
            val intent = Intent(this, ULavalActivity::class.java)
            startActivity(intent)
        }

        val buttonMonProfil: Button = findViewById(R.id.buttonMonProfil)
        buttonMonProfil.setOnClickListener {
            val intent = Intent(this, MonProfilActivity::class.java)
            intent.putExtra("profil", monProfil)
            startActivity(intent)
        }
    }
}