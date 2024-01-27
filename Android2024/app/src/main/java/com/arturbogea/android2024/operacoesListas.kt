package com.arturbogea.android2024
// Com as coleções, podemos fazer ordenações, alterações e filtrar elementos de uma lista.
fun main() {

    val listaLanche = listOf("hamburguer", "batata frita")
    val listaEntrada = listOf("coxinha de frango", "pipoca")

    val listaJunta = listaLanche.union(listaEntrada)
    println(listaJunta)
    
}


//MAP
// O map é um metodo que cria uma lista com o mesmo número de itens ou itens transformados

/*
val listaNome = listOf("artur", "lia", "clarice", "antonio", "enrico")

    val listaNova = mutableListOf<String>()
    listaNome.forEach{nome ->
        listaNova.add(nome.uppercase())
    }

    o metodo map vai fazer a mesma coisa que acima, so que mais simplificado, com menos codigo. Exemplo abaixo.


    val novalista = listaNome.map { nome ->
        nome.uppercase()
    }
    println(novalista)

    Dentro do map, podemos fazer varios tipos de transformações


 */

// O metodo union serve para justar itens de 2 listas