package com.esdraz.aulacomponenteslistagemcolecoes.testes

fun main() {

    val listaNomes = listOf("jose", "pedro", "maria", "ana", "zenu")
    val listaNumeros = listOf(2, 3, 9, 5)

    val novaListaNomes = listaNomes.sorted()
    val novaListaNomes1 = listaNomes.sortedDescending()

    val novaListaNumeros = listaNumeros.sorted()
    val novalistaNumeros1 = listaNumeros.sortedDescending()

    println(novaListaNomes)
    println(novaListaNomes1)
    println(novaListaNumeros)
    println(novalistaNumeros1)
}