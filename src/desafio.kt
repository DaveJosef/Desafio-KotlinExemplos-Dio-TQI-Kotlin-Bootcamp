import enum.Acessibilidade
import enum.Nivel
import model.*

// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

fun main() {

    val java = DesafioProjeto("Java", 20)
    val oo = DesafioProjeto("OO", 15)
    val poo = Curso("POO", 30)

    val javascript = Curso("Javascript", 20)
    val jquery = Curso("JQuery", 30)

    val conteudosJava: MutableCollection<ConteudoEducacional> = mutableListOf(java, oo, poo)
    val conteudosJavascript: MutableCollection<ConteudoEducacional> = mutableListOf(javascript, poo, jquery)

    val javaAvancado = Formacao(nome = "Java Avançado", conteudos = conteudosJava, nivel = Nivel.AVANCADO)
    val javascriptIntro = Formacao(nome = "JavaScript Introdutório", conteudos = conteudosJavascript, nivel = Nivel.BASICO)

    val pedro = Usuario("Pedro", "pedrinho@email.com")
    val suzana = Usuario("Suzie", "pequena@email.com")
    val alice = Usuario("Alice", "nopaisdasmaravilhas@email.com")

    javaAvancado matricular pedro
    javaAvancado matricular suzana

    javascriptIntro matricular alice
    javascriptIntro matricular pedro

    imprimir(javaAvancado)
    imprimir(javascriptIntro)

}
