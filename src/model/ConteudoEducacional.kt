package model

import enum.Tipo

abstract class ConteudoEducacional(var nome: String, val duracao: Int = 60, val tipo: Tipo = Tipo.NAO_DEFINIDO) {
    override fun toString(): String {
        return "${tipo.tipo} de: $nome"
    }
}
