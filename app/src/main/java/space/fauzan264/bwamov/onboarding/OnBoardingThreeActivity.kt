package space.fauzan264.bwamov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_on_boarding_three.*
import space.fauzan264.bwamov.R
import space.fauzan264.bwamov.sign.SignInActivity

class OnBoardingThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_three)

        button_next.setOnClickListener {
            finishAffinity()
            startActivity(Intent(this@OnBoardingThreeActivity, SignInActivity::class.java))
        }
    }
}