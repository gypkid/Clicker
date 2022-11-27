package com.example.clicker.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clicker.databinding.ActivityRankingBinding

class RankingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRankingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRankingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}