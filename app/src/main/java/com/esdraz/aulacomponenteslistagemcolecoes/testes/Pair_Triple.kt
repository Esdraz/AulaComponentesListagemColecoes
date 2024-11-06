package com.esdraz.aulacomponenteslistagemcolecoes.testes

fun main() {
//    val localizacao = Pair(10, 20)
//    val localizacao = 10 to 20
    val localizacao = Triple(10, 20, "pizzaria")

    println(localizacao.first)
    println(localizacao.second)
    println(localizacao.third)
}