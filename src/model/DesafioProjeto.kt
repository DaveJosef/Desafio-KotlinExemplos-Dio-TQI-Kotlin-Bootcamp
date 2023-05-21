package model

import enum.Tipo

class DesafioProjeto(nome: String, duracao: Int) : ConteudoEducacional(nome, tipo = Tipo.DESAFIO_PROJETO, duracao = duracao)
