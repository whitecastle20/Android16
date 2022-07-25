package kr.co.company.android16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

// 어플 첫 시작화면: 온보딩 페이지

class StartOnboardingActivity : AppCompatActivity() {

    // 변수 선언
    lateinit var logo1: ImageView
    lateinit var appExplain_textView: TextView
    lateinit var start_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_onboarding)

        // 액션바 숨기기 => *아직 미구현


        // 변수 연결
        logo1 = findViewById(R.id.logo1)
        appExplain_textView = findViewById(R.id.appExplain_textView)
        start_button = findViewById(R.id.start_button)

    }


}