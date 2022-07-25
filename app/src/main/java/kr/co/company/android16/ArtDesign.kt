package kr.co.company.android16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.VisibilitySetterAction
import android.widget.Button

class ArtDesign : AppCompatActivity() {

    // 변수 선언
    lateinit var ContemporaryArt : Button
    lateinit var CeramicsFiberArt : Button
    lateinit var VisualCommunicationDesign : Button
    lateinit var AdvancedMedia : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_art_design)

        // 변수 연결
        ContemporaryArt = findViewById(R.id.ContemporaryArt)
        CeramicsFiberArt = findViewById(R.id.CeramicsFiberArt)
        VisualCommunicationDesign = findViewById(R.id.VisualCommunicationDesign)
        AdvancedMedia = findViewById(R.id.AdvancedMedia)
    }
}