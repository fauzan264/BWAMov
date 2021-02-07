package space.fauzan264.bwamov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_on_boarding_two.*
import space.fauzan264.bwamov.R

class OnBoardingTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_two)

        button_next.setOnClickListener {
            startActivity(Intent(this@OnBoardingTwoActivity, OnBoardingThreeActivity::class.java))
        }
    }
}