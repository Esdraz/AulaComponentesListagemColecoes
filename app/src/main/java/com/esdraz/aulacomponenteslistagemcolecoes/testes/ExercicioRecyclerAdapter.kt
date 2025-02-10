package com.esdraz.aulacomponenteslistagemcolecoes.testes

class ExercicioRecyclerAdapter {
}

/*
* Esse adaptador é uma interface que define como um adaptador
* deve se comportar
* VOCÊ NÃO IRÁ ALTERAR ESSA INTERFACE
* */
interface Adaptador {

    /*
    * Esse metodo deve retornar a quantidade de itens que você quer exibir
    * Para isso pode utilizar qualquer tipo de lista, recomendo usar um listOf mesmo ;)
    * */
    fun quantidadeItens() : Int

    /*
    * Esse metodo é responsável por retornar cada item da lista, utilizando a posição
    * O metodo irá retornar uma string, e você pode montar o Layout como Quiser
    * */
    fun montarLayoutParaItem(posicao: Int) : String
}

/*
* Esse componente é que será responsável por fazer a listagem dos itens
* para isso passe para o atributo um adaptador
* VOCÊ NÃO IRÁ ALTERAR ESSA CLASSE
* */
class ComponenteListagem {

    var adaptador: Adaptador? = null

    fun executar(){
        if( adaptador != null ){

            val quantidadeItens = adaptador!!.quantidadeItens()
            for ( posicao in 0 until quantidadeItens){
                val item = adaptador!!.montarLayoutParaItem(posicao)
                println( item )
            }

        }else{
            println("Configure um adaptador para prosseguir")
        }
    }

}

class MeuAdaptador() {
}

fun main() {

    //Lista de itens
    val listaItens = listOf("jamilton", "ana", "maria", "pedro", "joão")

    val componenteListagem = ComponenteListagem()

}