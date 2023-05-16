package model

import enum.Nivel

data class Formacao(val nivel: Nivel?, val nome: String, var conteudos: Collection<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    infix fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun nivelSymbol() = when (nivel) {
        Nivel.BASICO -> "°"
        Nivel.INTERMEDIARIO -> "°°"
        Nivel.AVANCADO -> "°°°"
        else -> ""
    }

    override fun toString() = "{$nome, ${inscritos.toString()}, nivel - ${nivelSymbol()}}"

}
