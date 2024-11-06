package com.esdraz.aulacomponenteslistagemcolecoes.testes


fun main() {

    val listaFrutas = listOf("maça", "laranja", "banana")
    val listaValores = listOf(100, 500, 200, 400, 600, 99, 800)
    val listaNomes = listOf("pedro", "jose", "maria")

    //filter { fruta -> fruta == "laranjha" }
    val novaLista = listaFrutas.filter { it == "laranja" }
    val novaListaValores = listaValores.filter { it >= 200 }
    val novaListaNomes = listaNomes.filter { nome -> nome.contains("a") }

    println(novaLista)
    println(novaListaValores)
    println(novaListaNomes)
}