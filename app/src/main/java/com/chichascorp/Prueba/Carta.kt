package com.chichascorp.Prueba

import java.util.Stack

class Carta(val name:String) {


    fun accion(player1:Jugador, player2: Jugador){
        when (this.name){
            "Embajador"->{
                //accion
            }
            "Duke"->{
                duke(player1)
            }
            "Capitan"->{
                capitan(player1,player2)
            }
            "Asesino"->{
                asesino(player2)
            }
            "Condesa"->{
                condesa()
            }
        }
    }

    fun duke(player: Jugador){
        player.coins=player.coins+3
    }

    fun capitan(player1:Jugador, player2: Jugador){
        player2.coins=player2.coins-2
        player1.coins=player1.coins+2
    }

    fun asesino(player: Jugador){
        player.mazo.pop()
    }
    fun condesa(){
        //no se como boloquear al asesino
    }

    fun embajador(){

    }

}