package com.ptithcm.thuan6420.chatapplication.view.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ptithcm.thuan6420.chatapplication.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setEvent()
    }

    private fun setEvent() {
        ivBtnAddAccount.setOnClickListener{
            onClickToRegister()
        }
    }

    private fun onClickToRegister() {
        startActivity(Intent(this, RegisterActivity::class.java))
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay)
    }

}