package com.neppplus.loginlogicpractice_20220220

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {

            val inputId = edtId.text.toString()
            val inputPw = edtPassword.text.toString()

            if (inputId == "admin" && inputPw == "qwer") {
                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
            }
            else if (inputId != "admin") {
//                아이디부터, admin이 아님.

                Toast.makeText(this, "아이디가 잘못되었습니다.", Toast.LENGTH_SHORT).show()

            }
            else {
//                아이디는 admin이 맞다. => 로그인 실패 => 비번이 틀렸다.

                Toast.makeText(this, "비밀번호가 잘못되었습니다.", Toast.LENGTH_SHORT).show()

            }

        }

    }
}