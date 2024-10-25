package com.esdraz.aulacomponenteslistagemcolecoes.testes

data class Cliente(
    var nome: String = "",
    var idade: Int = 0
) {

}

fun main() {

    val cliente = Cliente("Pedro", 22)
    val cliente2 = Cliente("Maria", 33)

    val listaClientes = mutableListOf(cliente, cliente2)
    listaClientes.forEach { cliente -> println("Nome: ${cliente.nome} - Idade: ${cliente.idade}") }

    val listArray = arrayOf("Jose", "Pedro")
    listArray[0] = "Jose modificado"

    listArray.forEach { item -> println(item) }
}