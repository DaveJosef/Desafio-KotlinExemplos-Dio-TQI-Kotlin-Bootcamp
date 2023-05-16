package model

class Usuario(val nome: String, val email: String) {
    override fun toString() = "{$nome, $email}"
}
