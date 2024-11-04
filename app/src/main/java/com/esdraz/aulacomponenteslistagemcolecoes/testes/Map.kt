package com.esdraz.aulacomponenteslistagemcolecoes.testes



fun main() {

    val lista = mapOf(123 to "Notebook", 456 to "Ps5")

    lista.forEach { produto -> println("Chave: ${produto.key}: Valor: ${produto.value}") }
}