package es.cicero.tomas.common

enum class Etiqueta {
    SENSE_ETIQUETA,   // valor per defecte: no n'hi hauria d'haver cap
    PRINCIPAL,        // el programa principal: inici, final, separadors, què ha llançat
    FEINA,            // el que fa una corrutina o un fil: comença, avança, acaba
    RESULTAT,         // un valor calculat o rebut, un temps mesurat
    ESPERA,           // esperar un pany, un permís, un join o un recurs
    ERROR,            // excepcions i errors capturats
    CANCELLACIO,      // cancel·lacions, timeouts i neteja en sortir
    FLUX,             // emissions i recollides de Flow, StateFlow, SharedFlow i Channel
}

private val inici: Long = System.currentTimeMillis()

private val ampladaEtiqueta: Int = Etiqueta.entries.maxOf { it.name.length } + 2

fun log (
    missatge: String,
    etiqueta: Etiqueta = Etiqueta.SENSE_ETIQUETA
) {
    val ms = System.currentTimeMillis() - inici
    val columnaEtiqueta = "[etiqueta]".padEnd(ampladaEtiqueta)
    println("[${ms.toString().padStart(6)} ms] $columnaEtiqueta [${Thread.currentThread().name}] $missatge")
}