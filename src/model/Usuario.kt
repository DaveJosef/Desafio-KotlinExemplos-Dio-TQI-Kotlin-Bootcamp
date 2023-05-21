package model

import enum.Acessibilidade

data class Usuario(val nome: String, val email: String, var plano: Acessibilidade = Acessibilidade.LIVRE) {
    override fun toString() = "{$nome, $email}"
}
