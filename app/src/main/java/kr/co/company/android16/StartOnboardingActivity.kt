package kr.co.company.android16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
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

    // 시작하기 버튼 클릭 시 로그인 화면으로 이동
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId){
            R.id.start_button -> {
                val intent = Intent(this, SignUpActivity::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }


}