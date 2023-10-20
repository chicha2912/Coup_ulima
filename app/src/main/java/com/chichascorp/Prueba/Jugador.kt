package com.chichascorp.Prueba

import java.util.Stack

class Jugador(var name: String, var coins: Int, var mazo: Stack<Carta>, var mazomesa: Stack<Carta>) {

    fun coup(coins:Int,player:Jugador){
        this.coins =coins-7
    }

    fun pasar(coins:Int){
        this.coins =coins+1
    }

    fun ayudaExterior(coins:Int){
        this.coins =coins+2
    }
}