package com.manwouna.smashbasket.Controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.manwouna.smashbasket.Utilities.EXTRA_LEAGUE
import com.manwouna.smashbasket.R
import com.manwouna.smashbasket.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onBeginnerClicked(view: View){
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }

    fun onBallerClicked(view: View){
        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }

    fun onSkillFinishClicked(view: View){
        if (skill !=""){
            val finishIntent = Intent(this,FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_SKILL,skill)
            finishIntent.putExtra(EXTRA_LEAGUE,league)
            startActivity(finishIntent)
        }else{
            Toast.makeText(this, "Please, select a skill level.", Toast.LENGTH_SHORT).show()
        }

    }
}
