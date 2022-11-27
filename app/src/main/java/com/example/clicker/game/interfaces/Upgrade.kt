package com.example.clicker.game.interfaces

interface Upgrade {
    val name: String
    val description: String
    val points: Int
    var value: Int
    val cost: Int
    var counter: Int

    fun counterUp(): Int {
        return counter++
    }

    private fun sumePoint(){
        value = points * counter
    }

    fun add(){
        counterUp()
        sumePoint()
    }
}