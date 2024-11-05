package com.esdraz.aulacomponenteslistagemcolecoes.testes

fun converterMaiuscula(texto: String): String {
    return texto.uppercase()
}

fun main() {

    val lista = listOf("Jose", "Pedro", "Antonio", "Josefina", "Maria")

    //forma mais resumida usando it (representa cada elemento do lista)
    val novaLista = lista.map { it.uppercase() }
//    val novaLista = lista.map { nome -> converterMaiuscula(nome) }
//    val novaLista = lista.map { nome -> nome.uppercase() }

    println(novaLista)
}