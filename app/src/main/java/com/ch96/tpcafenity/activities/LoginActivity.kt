package com.ch96.tpcafenity.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ch96.tpcafenity.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    val binding:ActivityLoginBinding by lazy { ActivityLoginBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //로그인
        binding.btnLogin.setOnClickListener { clickLoginBtn() }

        //회원가입
        binding.btnSignup.setOnClickListener { clickSignupBtn() }

        //라디오버튼(자동로그인,아이디저장)
        autoLogin()
        saveId()

        //간편로그인
        binding.btnLoginKakao.setOnClickListener { clickKakaoBtn() }
        binding.btnLoginGoogle.setOnClickListener { clickGoogleBtn() }
        binding.btnLoginNaver.setOnClickListener { clickNaverBtn() }
    }

    private fun clickLoginBtn() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
    private fun clickSignupBtn() {
        startActivity(Intent(this, SignupActivity::class.java))
    }

    private fun autoLogin() {
        binding.radioBtnAutoLogin.isChecked()
    }
    private fun saveId() {
        binding.radioBtnSaveId.isChecked()
    }

    private fun clickKakaoBtn() {}
    private fun clickGoogleBtn() {}
    private fun clickNaverBtn() {}
}