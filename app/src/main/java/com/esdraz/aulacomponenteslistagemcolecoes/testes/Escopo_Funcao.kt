package com.esdraz.aulacomponenteslistagemcolecoes.testes

//variavel de escopo global
var nome = "Pedro"


fun executar() {
    //variavel de escopo local
    nome = "mudou para Maria"
}

class Pessoa1 {
    //variavel de escopo local
    val nome = "Pessoa Nome"
}

fun main() {

    executar() // muda a variável global para "mudou para Maria"
    println(nome) //imprime a var que antes era "Pedro" como "mudou para Maria"
}