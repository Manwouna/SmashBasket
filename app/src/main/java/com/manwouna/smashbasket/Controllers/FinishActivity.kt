package com.manwouna.smashbasket.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.manwouna.smashbasket.R
import com.manwouna.smashbasket.Utilities.EXTRA_LEAGUE
import com.manwouna.smashbasket.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueTxt.text="Looking for $league $skill league near you ..."
    }

}
