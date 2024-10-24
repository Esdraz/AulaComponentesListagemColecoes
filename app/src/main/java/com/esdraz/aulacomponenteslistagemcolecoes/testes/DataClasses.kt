package com.esdraz.aulacomponenteslistagemcolecoes.testes

data class Pergunta(val pergunta: String, val respostaCerta: Int)



fun main() {

    val pergunta1 = Pergunta("Qual pergunta?", 1)
    val pergunta2 = Pergunta("Qual pergunta?", 1)

    //desestruturação
    val (pergunta, resposta) = pergunta1

    println(pergunta)
    println(resposta)
/*    println(pergunta1)
    println(pergunta2)
    println(pergunta1 == pergunta2)*/
}