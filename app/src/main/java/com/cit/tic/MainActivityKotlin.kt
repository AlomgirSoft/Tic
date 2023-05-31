package com.cit.tic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.cit.tic.databinding.ActivityMainKotlinBinding

@Suppress("DEPRECATION")
class MainActivityKotlin : AppCompatActivity() {


    private lateinit var binding: ActivityMainKotlinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainKotlinBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

       binding.imageView.translationY=-1000f
        binding.ticTacToe.translationY=1000f

        binding.imageView.animate().translationY(0f).duration=1000
        binding.ticTacToe.animate().translationY(0f).duration=1000

    Handler(Looper.getMainLooper()).postDelayed({

        val intent = Intent(this, StartKtActivity::class.java)
        startActivity(intent)

    },3000)





    }
}