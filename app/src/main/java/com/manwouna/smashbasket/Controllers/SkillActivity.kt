package com.manwouna.smashbasket.Controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.manwouna.smashbasket.Model.Player
import com.manwouna.smashbasket.R
import com.manwouna.smashbasket.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""
    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBeginnerClicked(view: View){
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClicked(view: View){
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }

    fun onSkillFinishClicked(view: View){
        if (player.skill !=""){
            val finishIntent = Intent(this,FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        }else{
            Toast.makeText(this, "Please, select a skill level.", Toast.LENGTH_SHORT).show()
        }

    }
}
