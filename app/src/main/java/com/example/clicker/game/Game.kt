package com.example.clicker.game

import android.content.Context
import android.widget.Toast
import com.example.clicker.activities.GameActivity
import com.example.clicker.game.interfaces.Upgrade

class Game(
    val name: String,
) {
    val listOfUpgrades = listOf<Upgrade>(
        PermanentUpgrade("student","Student daje +1 zestawów", 1, 25),
        PermanentUpgrade("talented student","Talented Student daje +3 zestawów", 3, 50),
        PermanentUpgrade("manager","", 0, 0),
        PermanentUpgrade("visionary","", 0, 0),
        DurationUpgrade("school trip","", 0, 0),
        SingleUseUpgrade("one-time bonus","", 0, 0)
    )
    var score: Int = 0
    var money: Int = 0
    var upgradesPoints: Int = 0
    var upgrades = mutableListOf<Upgrade>()

    fun addPoints(value:Int){
        this.score += value
        this.money += value
    }

    fun addUpgradePoints(){
        addPoints(upgradesPoints)
    }

    fun buyUpgdate(upgrade: Upgrade, context: Context){
            upgrade.apply {
                if(this.cost <= money) {
                    this.add()
                    upgrades.add(this)
                    money -= this.cost
                    upgradesPoints += this.value
                }else{
                    Toast.makeText(context, "Nie masz wystarczająco dużo pieniedzy", Toast.LENGTH_SHORT).show()
                }
            }
    }

}
