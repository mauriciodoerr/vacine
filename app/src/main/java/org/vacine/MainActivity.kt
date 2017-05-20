package org.vacine

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById(R.id.btn_add).setOnClickListener{ goToCarteirinha() }
    }

    private fun goToCarteirinha() {
        startActivity(CarteirinhaActivity.getStartActivityIntent(this@MainActivity))
    }

    companion object {

        fun getStartActivityIntent(context: Context): Intent {
            val intent = Intent(context, MainActivity::class.java)
            return intent
        }
    }
}
