package kr.co.company.android16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button

class ChooseDepartment : AppCompatActivity() {

    lateinit var btnHumanities: Button
    lateinit var btnSocialSciences: Button
    lateinit var btnNaturalSciences: Button
    lateinit var btnFutureIndustrialConvergence: Button
    lateinit var btnArtDesign: Button
    lateinit var btnFreeMajor: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_department)

        btnHumanities = findViewById(R.id.btnHumanities)
        btnSocialSciences = findViewById(R.id.btnSocialSciences)
        btnNaturalSciences = findViewById(R.id.btnNatualSciences)
        btnFutureIndustrialConvergence = findViewById(R.id.btnFutureIndustrialConvergence)
        btnArtDesign = findViewById(R.id.btnArtDesign)
        btnFreeMajor = findViewById(R.id.btnFreeMajor)

        btnHumanities.setOnClickListener {
            val intent = Intent(this, Humanities::class.java)
        }
        btnSocialSciences.setOnClickListener {
            val intent = Intent(this, SocialSciences::class.java)
        }

        btnNaturalSciences.setOnClickListener {
            val intent = Intent(this, NaturalSciences::class.java)
        }

        btnFutureIndustrialConvergence.setOnClickListener {
            val intent = Intent(this, FutureIndustrialConvergence::class.java)
        }

        btnArtDesign.setOnClickListener {
            val intent = Intent(this, ArtDesign::class.java)
        }
    }
}