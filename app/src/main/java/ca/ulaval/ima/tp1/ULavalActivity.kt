package ca.ulaval.ima.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ULavalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ulaval)

        val buttonFermer = findViewById<Button>(R.id.buttonFermer)
        buttonFermer.setOnClickListener {
            finish()
        }
    }
}