package com.arturbogea.android2024

fun main() {

    // Vou criar uma outra lista, mas que recebe outros dados, mas, que ainda sim, vai utilizar o adapter.
    // Abaixo, vou criar um data classe para demonstrar

    //val listaItens = listOf("artur", "lia", "enrico", "antonio", "clarice")
    val listaItens = listOf(Paciente("Artur", 32), Paciente("Lia", 31), Paciente("Enrico", 7))

    val componenteListagem = ComponenteListagem()
    componenteListagem.adaptador = MeuAdaptador(listaItens)
    componenteListagem.executar()

    // Com isso eu posso sempre, criar o meu adaptador e passar para o adaptador e em seguida executar
    // Com isso, o componentelistagem se matem intacto. Ele é o mesmo componente independente da maneira que eu queira exibir os meus dados

}

data class Paciente(val nome: String, val idade: Int)

/*
* Abaixo o MeuAdaptador irá receber a impletação da interface Adaptador
* Depois irá receber os metodos do adaptador*/


// Com isso, eu utilizo os metodos quantidadeItens e montarLayoutParaItem e esses metodos retornam valores que são utilizados pelo componenteListagem
// O componenteListagem ele so recebe o adaptador. E para utilizar esse adaptador e permitir que utilize o tipo adaptador, preciso obrigatoriamente  implementar a interface da adaptador.
// Ai ele obriga a implementar os metodos dentro dela

// Vou mudar o tipo string do List para o paciente, apenas para demostrar utilizando outros itens.
class MeuAdaptador(lista: List<Paciente>) : Adaptador{

    private val listaItens = lista

    // A quantidade de itens, vai variar
    // Abaixo tem que retornar a quantidade correta de itens. Mas uma vez criando o adaptador, ele vai trabalhar com a quantidade de itens da lista.
    // A ideia do adaptador é adaptar a visualização lá para o componente de listagem
    // Abaixo estou passando a listaItens.size para retornar a quantidade de itens. A lista pode ter mais ou menos itens o componente de listagem irá saber
    // Depois que passar o listaItens.size, baseado na quantidade de itens, ele ira fazer a iteração entre os itens.
    override fun quantidadeItens(): Int {
        return listaItens.size
    }

    // Para montar o layout, irei utilizar a posicao, mas quem irá utilizar a posicao é o proprio componenteListagem
    // Quando o componenteListagem for utilizar o metodo montarLayoutParaItem, ele vai utizar a posicao para a exebição
    // para ele saber a quantidade de itens que ele irá utilizar, ele irá retornar a quantidade de itens
    // Ele utilizar o for, para percorrer a quantidade de itens e montando o layout para acada um dos itens
    // Explição do montarLayoutItemParaItem, continua abaixo, dentro da classe componenteListagem

    override fun montarLayoutParaItem(posicao: Int): String {
        // Abaixo eu crio a variavel nome que recebe o listaItens e irá utilizar a posição
        // Depois ele irá retornar a posição e em seguida o nome

        /* Abaixo coloquei comentado, pois irei fazer o teste com outros dados
        val nome = listaItens[posicao]
        return "($posicao) $nome "
        */

        val paciente = listaItens[posicao]
        var item = "Nome: ${paciente.nome} - Idade: ${paciente.idade} \n"
        item += "***************"
        return item

    }

    // Voltando para a explicação aqui, o montarLayout irá criar um for que irá percorrer conforme a quantidade da lista que está retornando da quantidadeItens e listaItens.size
    // Em seguida ele chama o montarLayoutParaItem


}

/*
* Esse adaptador é uma interface que define como um adaptador deve se comportar
* Não será alterado a interface
*/

interface Adaptador {

    /*
    * Esse metodo deve retornar a quantidade de itens que eu quero exibir
    * Para isso posso utilizar qualquer tipo de lista.
    */

    fun quantidadeItens() : Int

    /*
    * Esse metodo é responsavel para retornar cada iem da lista
    * O metodo irá retornar uma string. Pode ser montado o layout como quiser
    */

    fun montarLayoutParaItem(posicao: Int) : String
}

/*
* Esse componente é que será responsavel por fazer a listagem dos itens
* Para isso, devo atribuir um adaptador
* Não será alterado a classe
*/

class ComponenteListagem{

    /*
    * Aqui vou receber o adaptador e irei verificar se ele é nulo
    * Pega a quantidade de itens e utiliza para fazer um for. Que vai da posição 0 e pecorrer até a quantidade de itens
    * Depois o componente de listagem utiliza o adaptador para poder fazer a exebição*/

    // Depois que o meu adaptador estiver configurado, ele irá fazer a iteração pelos itens.
    // O componente de listagem não pode ser alterado.
    // O componente de listagem, basicamente irá fazer assim, ele irá verificar primeiro se o adaptador não está nulo
    // Caso o adaptador esteja nulo, ele dará uma mensagem, conforme está abaixo.


    // Depois temos a quantidade de itens que pega da propria quantidadeItens
    // O componenteListagem utiliza os metodos do adaptador para que ele consiga fazer a exebição
    // Mas, é preciso ter os metodos quantidadeItens e montarLayoutParaItem e isso é feito usando a interface
    // A interface é que decide que define que se componenteListagem recebe um adaptador do tipo Adaptador e obriga todos que tem o tipo adaptador a terem os metodos quantidadeItens e montarLayoutParaItem
    // Pois eles utilizam esses metodos.

    var adaptador: Adaptador? = null

    // O montarLayoutParaItem, é utilizado pelo adaptador que utiliza o metodo para passar a posicao
    // Como o item está recebendo o adaptador e utilizando o montarLayoutParaItem, ele que está sendo passado no println
    // Explicação volta para a classe MeuAdaptador

    fun executar(){
        if (adaptador != null){
            val quantidadeItens = adaptador!!.quantidadeItens()
            for (posicao in 0 until quantidadeItens){
                val item = adaptador!!.montarLayoutParaItem(posicao)
                println(item)
            }
        }else{
            println("Configure um adaptador para prosseguir")
        }
    }


}