package com.esdraz.aulacomponenteslistagemcolecoes.testes

fun main() {

    val listaLanches = listOf("Hamburguer", "Batata Frita")
    val listaEntradas = listOf("Coxa de Frango", "Pipoca")

    val listaExclusao = listOf("Batata Frita")
    val novalista = listaLanches.union(listaEntradas)
    val novalista1 = listaEntradas + listaLanches
    val listaCompleta = novalista1 - listaExclusao

    println(novalista)
    println(novalista1)
    println(listaCompleta)
}