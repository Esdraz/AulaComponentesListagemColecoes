package com.esdraz.aulacomponenteslistagemcolecoes.testes

class Usuario() {
    var nome: String = ""
        get() {
            return field.uppercase()
        }
        set(value) {
            field = "set: $value"
        }
    var idade: Int = 0
    val maiorIdade
        get() = idade >= 18
}


fun main() {

    val usuario = Usuario()
    usuario.nome = "Francisco"
    usuario.idade = 33

    println("Nome: ${usuario.nome} - Idade: ${usuario.idade} - MaiorIdade: ${usuario.maiorIdade}")
}