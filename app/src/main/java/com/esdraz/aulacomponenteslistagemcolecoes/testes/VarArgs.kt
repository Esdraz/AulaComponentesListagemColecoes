package com.esdraz.aulacomponenteslistagemcolecoes.testes

class User {
    fun salvarTelefones(vararg telefones: String){
        for (telefone in telefones) {
            println("Telefone: $telefone")
        }
    }
}


fun main() {
    println("Versão Java")
    val person = Person()
    person.salvarTelefone(
        "(83) 999994444",
        "(88) 888882222",
        "(11) 888882333",
        "(85) 823131451",
        )

    println("Versão KOTLIN")
    val user = User()
    user.salvarTelefones(
        "(83) 999994444",
        "(88) 888882222",
        "(11) 888882333",
        "(85) 823131451",
    )

}