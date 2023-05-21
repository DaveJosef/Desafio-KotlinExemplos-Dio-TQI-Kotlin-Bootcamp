package model

import enum.Acessibilidade
import enum.Nivel
import java.lang.Exception

data class Formacao(val nivel: Nivel?, val nome: String, var conteudos: Collection<ConteudoEducacional>, val acessibilidade: Acessibilidade = Acessibilidade.PRO) {

    val inscritos = mutableListOf<Usuario>()

    infix fun matricular(usuario: Usuario) {
        if (usuario.plano === acessibilidade) {
            inscritos.add(usuario)
        } else {
            throw Exception("Formação não acessível para o usuario $usuario que possui plano ${usuario.plano}")
        }
    }

    fun nivelSymbol() = when (nivel) {
        Nivel.BASICO -> "°"
        Nivel.INTERMEDIARIO -> "°°"
        Nivel.AVANCADO -> "°°°"
        else -> ""
    }

    override fun toString() = "{$acessibilidade, $nome, ${inscritos.toString()}, nivel - ${nivelSymbol()}, conteudos: ${this.conteudos}}"

}
