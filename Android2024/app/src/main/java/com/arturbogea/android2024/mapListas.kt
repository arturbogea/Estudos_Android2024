package com.arturbogea.android2024

fun main() {

    val lista = mutableMapOf("nome" to "notebook", "preço" to 2450)
    //para utilizar o forEach, é diferente com o map. Ele vai passar tanto a chave, quanto o valor
    //println(lista.put("modelo", "dell"))
    println(lista.size)
    lista["modelo"] = "Dell"
    lista.forEach { produto ->
        println("${produto.key} = ${produto.value}")
    }
    println(lista.size)
    println(lista.clear())
    println(lista.size)

}

// O map utiliza chave-valor. As chaves são unicas e os valores podem se repetir. Para adicionar itens, não se utiliza o .add. Agora é utilizado o .put.
// Enquanto no list e no set cada item tem os seus indices: Ex -> artur = 0, Lia = 1, o map cada item é o chave valor. EX: -> artur, 32 = 0, Lia, 31 = 1

    /*
    val lista = mapOf(1250 to "Notebook", 2432 to "Celular")
    //para utilizar o forEach, é diferente com o map. Ele vai passar tanto a chave, quanto o valor
    lista.forEach { produto ->
        println("${produto.key} = ${produto.value}")
    }
     */

// Usando com o data classe

data class Produto(val nome: String)
    /*
    val lista = mapOf(1250 to Produto("notebook"), 2432 to Produto("celular"))
    //para utilizar o forEach, é diferente com o map. Ele vai passar tanto a chave, quanto o valor
    lista.forEach { produto ->
        println("${produto.key} = ${produto.value}")
    }
     */
