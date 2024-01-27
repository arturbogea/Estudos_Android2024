package com.arturbogea.android2024

fun main() {

    //val lista = setOf("Clarice", "Antonio", "Enrico")
    //val lista = mutableSetOf("Clarice", "Antonio", "Enrico")
    val lista = mutableSetOf(Carro("Sentra", "Nissan"), Carro("Civic", "Honda"), Carro("Corola", "Toyota"))

    //Como estou passando uma data class como parametro no construtor, não é impossivel incluir so textos. Para adionar itens na lista, devemos usar o exemplo abaixo

    lista.add(Carro("C60", "Volvo"))

    lista.forEach { nome ->
        println("${nome.marca} - ${nome.nome}")
    }

}

data class Carro(val nome: String, val marca: String)

// O set, são coleções de elementos unicos. Ou seja, os elementos não se repetem. Não é possivel alterar ou acessar os itens, pelo indice []


    /*
    val lista = setOf("Clarice", "Antonio", "Enrico")
    lista.forEach { nome ->
        println(nome)
    }

    val lista = mutableSetOf("Clarice", "Antonio", "Enrico")
    lista.add("Antonela")
    lista.remove("Antonela")
    lista.forEach { nome ->
        println(nome)
    }

     */

//Usando com o data class

    /*
    val lista = mutableSetOf(Carro("Sentra", "Nissan"), Carro("Civic", "Honda"), Carro("Corola", "Toyota"))
    //Como estou passando uma data class como parametro no construtor, não é impossivel incluir so textos. Para adionar itens na lista, devemos usar o exemplo abaixo
    lista.add(Carro("C60", "Volvo"))
    lista.forEach { nome ->
        println("${nome.marca} - ${nome.nome}")
    }
     */