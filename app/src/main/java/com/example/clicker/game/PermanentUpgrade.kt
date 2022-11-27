package com.example.clicker.game

import com.example.clicker.game.interfaces.Upgrade

class PermanentUpgrade(
    override val name: String,
    override val description: String,

    override val points: Int,
    override val cost: Int,
) : Upgrade {

    override var value: Int = 0
    override var counter = 0

}


