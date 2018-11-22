package com.manwouna.smashbasket.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.manwouna.smashbasket.Model.Player
import com.manwouna.smashbasket.R
import com.manwouna.smashbasket.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueTxt.text="Looking for ${player.league} ${player.skill} league near you ..."
    }

}
