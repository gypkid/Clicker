package com.example.clicker.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.clicker.databinding.ActivityGameBinding
import com.example.clicker.game.Game
import com.example.clicker.game.PermanentUpgrade
import com.example.clicker.game.interfaces.Upgrade
import com.example.clicker.utils.GameState

class GameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGameBinding
    private lateinit var gameState: GameState
    private lateinit var game: Game

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        if ( intent.getIntExtra("GAME_STATE", 100) == GameState.NEWGAME.value){
            game = Game("player1")
            binding.tvScore.setText("Score: ${game.score}")
        }
        if (intent.getIntExtra("GAME_STATE", 200) == GameState.CONTINUE.value){
            game = Game("player2")
            game.addPoints(512)
            binding.tvScore.setText("Score: ${game.score}")
            binding.tvMoney.setText("Money: ${game.money}")
        }
    }

    fun buyUpgrade(v: View){
        if(v.id.equals(binding.button2.id)){
            game.buyUpgdate(game.listOfUpgrades[0], this)
            binding.tvScore.setText("Score: ${game.score}")
            binding.tvMoney.setText("Money: ${game.money}")
            binding.textView8.setText(game.listOfUpgrades[0].value.toString())
        }
        if(v.id.equals(binding.button3.id)){
            game.buyUpgdate(game.listOfUpgrades[1], this)
            binding.tvScore.setText("Score: ${game.score}")
            binding.tvMoney.setText("Money: ${game.money}")
            binding.textView9.setText(game.listOfUpgrades[1].value.toString())
        }
    }

}