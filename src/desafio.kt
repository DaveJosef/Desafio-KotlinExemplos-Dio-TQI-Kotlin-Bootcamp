import enum.Nivel
import model.ConteudoEducacional
import model.Formacao
import model.Usuario
import model.imprimir

// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

fun main() {

    val java = ConteudoEducacional("Java", 20)
    val oo = ConteudoEducacional("OO", 15)
    val poo = ConteudoEducacional("POO", 30)

    val javascript = ConteudoEducacional("Javascript", 20)
    val jquery = ConteudoEducacional("JQuery", 30)

    val conteudosJava: MutableCollection<ConteudoEducacional> = mutableListOf(java, oo, poo)
    val conteudosJavascript: MutableCollection<ConteudoEducacional> = mutableListOf(javascript, poo, jquery)

    val javaSamurai = Formacao(nome = "Java Samurai Ninja", conteudos = conteudosJava, nivel = Nivel.AVANCADO)
    val javaScript = Formacao(nome = "JavaScript Introdutório", conteudos = conteudosJavascript, nivel = Nivel.BASICO)

    val pedro = Usuario("Pedro", "pedrinho@email.com")
    val suzana = Usuario("Suzie", "pequena@email.com")
    val alice = Usuario("Alice", "nopaisdasmaravilhas@email.com")

    javaSamurai matricular pedro
    javaSamurai matricular suzana

    javaScript matricular alice
    javaScript matricular pedro

    imprimir(javaSamurai)
    imprimir(javaScript)

}
