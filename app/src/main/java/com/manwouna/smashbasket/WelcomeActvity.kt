package com.manwouna.smashbasket

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome_actvity.*

class WelcomeActvity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_actvity)

        getStartedBtn.setOnClickListener {
            val leagueIntent= Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
