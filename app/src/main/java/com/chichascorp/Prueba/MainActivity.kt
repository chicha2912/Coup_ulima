package com.chichascorp.Prueba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import java.util.Stack


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {R.layout.activity_main}

        var mazoMesa=crearMazo()
        var mazoJug=crearMazoJug(mazoMesa)

    }
}

private fun crearMazo(): Stack<Carta> {
    var mazoCompleto= Stack<Carta>()
    for (x in 0..1){
        mazoCompleto.push(Carta("Embajador"))
    }
    for (x in 0..1){
        mazoCompleto.push(Carta("Asesino"))
    }
    for (x in 0..1){
        mazoCompleto.push(Carta("Condesa"))
    }
    for (x in 0..1){
        mazoCompleto.push(Carta("Capitan"))
    }
    for (x in 0..1){
        mazoCompleto.push(Carta("Duke"))
    }
    return mazoCompleto
}

private fun crearMazoJug(mazoMesa: Stack<Carta>):Stack<Carta> {
    var mazojug= Stack<Carta>()
    for (x in 0..1){
        var cartaaux = mazoMesa.pop()
        mazojug.push(cartaaux)
    }
    return mazojug
}

private fun crearJugador(mazojug: Stack<Carta>,mazoMesa: Stack<Carta>){
    var jugador=Jugador("chicha", 0,mazojug, mazoMesa)
}

