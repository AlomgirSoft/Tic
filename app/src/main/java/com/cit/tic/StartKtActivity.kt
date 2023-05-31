package com.cit.tic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cit.tic.databinding.ActivityMainKotlinBinding
import com.cit.tic.databinding.ActivityStartKtBinding

class StartKtActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartKtBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartKtBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startGameBtn.setOnClickListener {

            val  intent= Intent(this,GameActivity::class.java)
            startActivity(intent)

        }
    }
}