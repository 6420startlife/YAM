package com.ptithcm.thuan6420.chatapplication.view.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ptithcm.thuan6420.chatapplication.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        setEvent()
    }

    private fun setEvent() {
        ivBtnBackLogin.setOnClickListener{
            onClickToLogin()
        }
    }

    private fun onClickToLogin() {
        startActivity(Intent(this, LoginActivity::class.java))
        overridePendingTransition(R.anim.slide_in_left, R.anim.stay)
    }
}