package com.cit.tic

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.cit.tic.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity() {

    private lateinit var exitButton: Button
    private lateinit var playAgainButton: Button
    private lateinit var resultShowTv: TextView

    private lateinit var binding: ActivityGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)





    }

    fun btnClick(view:View){

        var  callId=0
        val btnSelect=view as Button
        when(btnSelect.id){
            R.id.topBtn1->
                callId =1
            R.id.topBtn2->
                callId =2
            R.id.topBtn3->
                callId =3
            R.id.secondBtn1->
                callId =1
            R.id.secondBtn2->
                callId =2
            R.id.secondBtn3->
                callId =3
            R.id.threeBtn1->
                callId =1
            R.id.threeBtn2->
                callId =2
            R.id.threeBtn3->
                callId =3
        }

    playGame(callId,btnSelect)
     cheekWinner()
    }


    var activePlayer=1
    val player1= mutableListOf<Int>()
    val player2= mutableListOf<Int>()



    fun playGame(callId:Int,btnSelect:Button){
        if (activePlayer==1){
            btnSelect.text="x"
            btnSelect.setBackgroundResource(R.color.yellow)
            player1.add(callId)
            activePlayer=2
        }else{
            btnSelect.text="0"
            btnSelect.setBackgroundResource(R.color.rad)
            player2.add(callId)
            activePlayer=1
        }
btnSelect.isEnabled=false
    }



    fun cheekWinner(){
        var winner=-1


        if (player1.contains(1)&&player1.contains(2)&&player1.contains(3)){
            winner=1
        }
        if (player2.contains(1)&&player2.contains(2)&&player2.contains(3)){
            winner =2
        }

        if (player1.contains(4)&&player1.contains(5)&&player1.contains(6)){
            winner=1
        }
        if (player2.contains(4)&&player2.contains(5)&&player2.contains(6)){
            winner =2
        }


        if (player1.contains(7)&&player1.contains(8)&&player1.contains(9)){
            winner=1
        }
        if (player2.contains(7)&&player2.contains(8)&&player2.contains(9)){
            winner =2
        }

//col 1 winner
        if (player1.contains(1)&&player1.contains(4)&&player1.contains(7)){
            winner=1
        }
        if (player2.contains(1)&&player2.contains(4)&&player2.contains(7)){
            winner =2
        }
        //col 2 winner
        if (player1.contains(2)&&player1.contains(5)&&player1.contains(8)){
            winner=1
        }
        if (player2.contains(2)&&player2.contains(5)&&player2.contains(8)){
            winner =2
        }

////col 3 winner

        if (player1.contains(3)&&player1.contains(6)&&player1.contains(9)){
            winner=1
        }
        if (player2.contains(3)&&player2.contains(6)&&player2.contains(9)){
            winner =2
        }

        if (player1.contains(1)&&player1.contains(5)&&player1.contains(9)){
            winner=1
        }
        if (player2.contains(1)&&player2.contains(5)&&player2.contains(9)){
            winner =2
        }



        if (winner==1){

      showAlert1()

        }else if (winner==2){
             showAlert2()
        }


    }


    fun showAlert1(){
        val customDialog = AlertDialog.Builder(this)
        val inflater = LayoutInflater.from(this)
        var dialogView: View = inflater.inflate(R.layout.result_dialog, null)
        customDialog.setCancelable(false)
        customDialog.setView(dialogView)

        exitButton= dialogView.findViewById(R.id.exitBtn)
        playAgainButton= dialogView.findViewById(R.id.playAgainBtn)
        resultShowTv= dialogView.findViewById(R.id.resultShowTv)

        exitButton.setOnClickListener {
            val  intent= Intent(this,StartKtActivity::class.java)
            startActivity(intent)
        }


        playAgainButton.setOnClickListener {
            val intent = Intent(this,GameActivity::class.java)
            startActivity(intent)
        }

        resultShowTv.setText("Player 1 win the game")

        customDialog.show()

    }


    fun showAlert2(){

        val customDialog = AlertDialog.Builder(this)
        val inflater = LayoutInflater.from(this)
        var dialogView: View = inflater.inflate(R.layout.result_dialog, null)
        customDialog.setCancelable(false)
        customDialog.setView(dialogView)

        exitButton= dialogView.findViewById(R.id.exitBtn)
        playAgainButton= dialogView.findViewById(R.id.playAgainBtn)
        resultShowTv= dialogView.findViewById(R.id.resultShowTv)

        exitButton.setOnClickListener {
            val  intent= Intent(this,StartKtActivity::class.java)
            startActivity(intent)
        }


        playAgainButton.setOnClickListener {
            val intent = Intent(this,GameActivity::class.java)
            startActivity(intent)
        }

        resultShowTv.setText("Player 2 win the game")

        customDialog.show()
    }
}