package com.example.clicker.game

import com.example.clicker.game.interfaces.Upgrade
import kotlin.time.Duration

class DurationUpgrade(
    override val name: String,
    override val description: String,
    override val cost: Int,
    override val points: Int
) : Upgrade{

    override var value: Int = 0
    override var counter = 0
    var time : Double = 0.0

    public fun setDuration(ms: Double){
        time = ms
    }

}