package com.arturbogea.android2024

fun main() {

    // Aqui as variaveis estão recebendo atributos da data class Cliente
    val cliente1 = Cliente("Artur", 32)
    val cliente2 = Cliente("Lia", 31)

    // O mutableList está com os itens cliente1 e cliente2. Eles estão recebendo os parametros da data class
    val listaClientes = mutableListOf(cliente1, cliente2)
    listaClientes.forEach { cliente ->
        println("${cliente.nome} - ${cliente.idade}")
    }

    /*val listaArray = mutableListOf("Artur", "Lia")
    listaArray.forEach { item ->
        println(item)
    }*/

}

// Trabalhando com o listOf. A quantidade dos itens é fixo desde o momento que é criada.

    /*
        val listaArray = listOf("Artur", "Lia")
    listaArray.forEach { item ->
        println(item)
    }
     */


// Trabalhando com o mutableListOf

    /*
    val listaArray = mutableListOf("Artur", "Lia")
    listaArray.add("Enrico")
    listaArray.remove("Enrico")
    listaArray.add("Clarice")
    listaArray.add("Antonio")
    listaArray.removeAt(3)
    listaArray.forEach { item ->
        println(item)
    }
     */

// Utilizando data class para passar dados para uma lista

data class Cliente(val nome: String, val idade: Int)

/*

    // Aqui as variaveis estão recebendo atributos da data class Cliente
    val cliente1 = Cliente("Artur", 32)
    val cliente2 = Cliente("Lia", 31)

    // O mutableList está com os itens cliente1 e cliente2. Eles estão recebendo os parametros da data class
    val listaClientes = mutableListOf(cliente1, cliente2)
    listaClientes.forEach { cliente ->
        println("${cliente.nome} - ${cliente.idade}")
    }*/


