package com.esdraz.aulacomponenteslistagemcolecoes.testes


class Matematica {

/*    fun somar(): Int {
        return 10 + 10
    }*/
}

fun somar(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun calcular(funcao: (Int, Int) -> Int) {
    val retorno = funcao(10, 10)
    println(retorno)
}


fun main() {

    calcular(::somar)
/*    val matematica = Matematica()
    val retorno = matematica.somar()*/
}