package ca.ulaval.ima.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MonProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mon_profil)

        val profil = intent.getParcelableExtra<Profil>("profil")

        val prenomTextView: TextView = findViewById(R.id.prenomTextView)
        val nomTextView: TextView = findViewById(R.id.nomTextView)
        val dateNaissanceTextView: TextView = findViewById(R.id.dateNaissanceTextView)
        val idulTextView: TextView = findViewById(R.id.idulTextView)

        prenomTextView.text = "Prénom : ${profil?.prenom}"
        nomTextView.text = "Nom de famille : ${profil?.nom}"
        dateNaissanceTextView.text = "Date de naissance : ${profil?.dateNaissance}"
        idulTextView.text = "IDUL : ${profil?.idul}"
    }
}