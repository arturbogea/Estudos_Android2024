package com.arturbogea.android2024

fun main() {

    //Outra possibilidade de utilizar o filter. É um pouco parecido com o if. Sempre terá uma condição para ser utilizado. No caso abaixo, estamos puxando os itens mais vendidos.
    val listaVendas = listOf(100, 500, 150, 800, 200, 900, 600)
    /*val novaListaVendas = listaVendas.filter {maisVendidos ->
        maisVendidos >= 600 // a condição sempre será true ou false. Se for true, ele colocar o item ou os itens, na nova lista. Podemos utilizar de uma forma mais curta.
    }*/
    val novaListaVendas = listaVendas.filter { it >= 500 }
    println(novaListaVendas.sorted()) // eu coloquei o sorted, para ele puxar na ordem crescente



}

/*
//Basicamente o filter vai percorrer cada um dos itens e vai fazer uma verificação e vai retornar o item se tiver na lista. No caso abaixo, ele vai colocar o item na nova lista, caso seja true
    val listaFrutas = listOf("maça", "banana", "laranja")
    val novaLista = listaFrutas.filter {fruta ->
        fruta == "laranja"
        println(novaLista)
    }
 */
