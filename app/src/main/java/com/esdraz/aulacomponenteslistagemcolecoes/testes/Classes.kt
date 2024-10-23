package com.esdraz.aulacomponenteslistagemcolecoes.testes

class Motorista(val nome: String) {

    fun exibirDadosMotorista() = println("Motorista: $nome")

    // precisa da instancia de motorista pra ser acessada
    inner class Caminhao(val nomeCaminhao: String) {
        fun exibirDadosCaminhao() = println("Caminhão: $nomeCaminhao, Motorista: $nome")
    }
}


fun main() {

    val motorista = Motorista("Jose")
    val caminhao = motorista.Caminhao("ZZ 99")
    caminhao.exibirDadosCaminhao()

/*    val motorista = Motorista("Pedro")
    motorista.exibirDadosMotorista()

    val caminhao = Motorista.Caminhao("WHZ 200")
    caminhao.exibirDadosCaminhao()*/
}