package space.fauzan264.bwamov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_on_boarding_one.*
import space.fauzan264.bwamov.R
import space.fauzan264.bwamov.sign.SignInActivity

class OnBoardingOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_one)

        button_next.setOnClickListener {
            startActivity(Intent(this@OnBoardingOneActivity, OnBoardingTwoActivity::class.java))
        }

        button_skip.setOnClickListener {
            finishAffinity()
            startActivity(Intent(this@OnBoardingOneActivity, SignInActivity::class.java))
        }
    }
}