package model

import enum.Tipo

class Curso(nome: String, duracao: Int) : ConteudoEducacional(nome, tipo = Tipo.CURSO, duracao = duracao)
