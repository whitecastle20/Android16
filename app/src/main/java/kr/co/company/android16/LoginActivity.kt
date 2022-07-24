package kr.co.company.android16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

// 로그인 페이지

class LoginActivity : AppCompatActivity() {

    // 변수 선언
    lateinit var logo2_imageView: ImageView
    lateinit var emailID_editText: EditText
    lateinit var email_icon_imageView: ImageView
    lateinit var password_editText: EditText
    lateinit var password_imageView: ImageView
    lateinit var login_button: Button
    lateinit var forget_password: Button
    lateinit var signUp_textView:TextView
    lateinit var signUp_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // 액션바 숨기기 => *아직 미구현


        // 변수 연결
        logo2_imageView = findViewById(R.id.logo2_imageView)
        emailID_editText = findViewById(R.id.emailID_editText)
        email_icon_imageView = findViewById(R.id.email_icon_imageView)
        password_editText = findViewById(R.id.password_editText)
        password_imageView = findViewById(R.id.password_imageView1)
        login_button = findViewById(R.id.login_button)
        forget_password = findViewById(R.id.forget_password)
        signUp_textView = findViewById(R.id.signUp_textView)
        signUp_button = findViewById(R.id.signUp_button)


    }
}