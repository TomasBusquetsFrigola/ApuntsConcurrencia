package es.cicero.tomas

import es.cicero.tomas.common.Etiqueta
import es.cicero.tomas.common.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    log("Inici", Etiqueta.PRINCIPAL)
    launch {
        delay(500)
        log("Sóc la corrutina filla", Etiqueta.FEINA)
    }
    log("He llançat la filla", Etiqueta.PRINCIPAL)
}