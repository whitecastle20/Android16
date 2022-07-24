package kr.co.company.android16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

// 회원가입 페이지

class SignUpActivity : AppCompatActivity() {

    // 변수 선언
    lateinit var schoolEmail_textView: TextView
    lateinit var schoolEmail_editText: EditText
    lateinit var email_icon_imageView:ImageView
    lateinit var emailCheck_button: Button
    lateinit var checkNumber_textView: TextView
    lateinit var checkNumber_editText: EditText
    lateinit var checkNumber_imageView: ImageView
    lateinit var numberCheck_button: Button
    lateinit var dividingLine_imageView1: ImageView
    lateinit var password_textView: TextView
    lateinit var password_editText: EditText
    lateinit var password_imageView1: ImageView
    lateinit var rePassword_textView: TextView
    lateinit var rePassword_editText: EditText
    lateinit var password_imageView2: ImageView
    lateinit var dividingLine_imageView2: ImageView
    lateinit var userName_textView: TextView
    lateinit var userName_editText: EditText
    lateinit var userStudentID_textView: TextView
    lateinit var userStudentID_editText: EditText
    lateinit var start_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // 변수 연결
        schoolEmail_textView = findViewById(R.id.schoolEmail_textView)
        schoolEmail_editText = findViewById(R.id.schoolEmail_editText)
        email_icon_imageView = findViewById(R.id.email_icon_imageView)
        emailCheck_button = findViewById(R.id.emailCheck_button)
        checkNumber_textView = findViewById(R.id.checkNumber_textView)
        checkNumber_editText = findViewById(R.id.checkNumber_editText)
        checkNumber_imageView = findViewById(R.id.checkNumber_imageView)
        numberCheck_button = findViewById(R.id.numberCheck_button)
        dividingLine_imageView1 = findViewById(R.id.dividingLine_imageView1)
        password_textView = findViewById(R.id.password_textView)
        password_editText = findViewById(R.id.password_editText)
        password_imageView1 = findViewById(R.id.password_imageView1)
        rePassword_textView = findViewById(R.id.rePassword_textView)
        rePassword_editText = findViewById(R.id.rePassword_editText)
        password_imageView2 = findViewById(R.id.password_imageView2)
        dividingLine_imageView2 = findViewById(R.id.dividingLine_imageView2)
        userName_textView = findViewById(R.id.userName_textView)
        userName_editText = findViewById(R.id.userName_editText)
        userStudentID_textView = findViewById(R.id.userStudentID_textView)
        userStudentID_editText = findViewById(R.id.userStudentID_editText)
        start_button = findViewById(R.id.start_button)

    }

}