package com.manwouna.smashbasket.Controllers

import android.content.Intent
import android.os.Bundle
import com.manwouna.smashbasket.R
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
