package com.esdraz.aulacomponenteslistagemcolecoes.testes


class Mensagem (
    val mensagem: String,
    val duracao: Int
){

    companion object {

        const val DURACAO_CURTA = 0
        const val DURACAO_LONGA = 1

        fun construirTexto(mensagem: String, duracao: Int) : Mensagem {
            return Mensagem(mensagem, duracao)
        }

    }

    fun exibir(){
        println("M: ${this.mensagem} - ${this.duracao}")
    }
}

class Pessoa{
    private var nome: String = ""
    private var idade: Int = 0

    fun setNome(nome: String): Pessoa {
        this.nome = nome
        return this
    }

    fun setIdade(idade: Int): Pessoa {
        this.idade = idade
        return this
    }

    fun printInfo() {
        println("Nome: $nome, Idade: $idade")
    }
}


fun main() {

    val pessoa = Pessoa().setNome("Pedro").setIdade(22)
    pessoa.printInfo()

    Mensagem.construirTexto("text Toast manual", Mensagem.DURACAO_LONGA).exibir()
}
