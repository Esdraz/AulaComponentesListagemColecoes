package com.esdraz.aulacomponenteslistagemcolecoes.testes

data class Carro(
    val nome: String,
    val marca: String,
)


fun main() {
    // set imutável
    val lista = setOf("Jose", "Pedro", "Maria", "Tereza")
    val novaList = lista.plus("Firmino")

    val listaCarros = mutableSetOf(Carro("Civic", "Honda"), Carro("KA", "Ford"))

    val listaMutavel = mutableSetOf("Jose", "Pedro", "Maria", "Tereza")

    println("Lista Imutável:")
    lista.forEach { nome -> println(nome) }
    println("-------")

    novaList.forEach { nome -> println(nome) }

    println("Lista mutável:")
    listaMutavel.add("Joaquim")
    listaMutavel.remove("Pedro")
    listaMutavel.forEach { nome -> println(nome) }


    listaCarros.forEach { carro -> println("Modelo: ${carro.nome}: Marca: ${carro.marca}") }
}