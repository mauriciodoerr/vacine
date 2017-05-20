package org.vacine

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class CarteirinhaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carteirinha)
    }

    companion object {

        fun getStartActivityIntent(context: Context): Intent {
            val intent = Intent(context, CarteirinhaActivity::class.java)
            return intent
        }
    }
}
