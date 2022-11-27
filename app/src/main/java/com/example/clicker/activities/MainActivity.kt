package com.example.clicker.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.clicker.databinding.ActivityMainBinding
import com.example.clicker.utils.GameState

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun startNewGame(view: View){
        Intent(this, GameActivity::class.java).apply {
            this.putExtra("GAME_STATE", GameState.NEWGAME.value)
            startActivity(this)
        }
    }

    fun continueGame(view: View){
        Intent(this, GameActivity::class.java).apply {
            this.putExtra("GAME_STATE", GameState.CONTINUE.value)
            startActivity(this)
        }
    }

    fun showRankingActivity(view: View){
        Intent(this, RankingActivity::class.java ).apply{
            startActivity(this)
        }
    }

    fun closeApp(view: View){
        System.exit(0)
    }
}