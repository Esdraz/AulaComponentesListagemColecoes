package com.esdraz.aulacomponenteslistagemcolecoes.testes


fun main() {
    val lista = intArrayOf(1, 2, 3, 4, 5, 10)
    println("tamanho da lista: ${lista.size}")


    val novaLista = lista.plus(100)

    //fazer exibição do array
    novaLista.forEach { item -> if (item >= 5) println(item)
    }
}