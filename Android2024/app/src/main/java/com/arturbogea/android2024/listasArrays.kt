package com.arturbogea.android2024

fun main() {

    val lista = arrayOf("Artur", 32, "Lia", 31, "Enrico", 7)
    println(lista.contains("Artur"))


}

//O forEach ele permite pecorra cada um dos itens para fazer a exebição

    /*val lista = arrayOf("Artur", 32, "Lia", 31)
    lista.forEach { item ->
        println(item)
    }*/

//[] get que é pegar um item especifico do array. Pegando a posição do item. Pode se utilizar o metodo get ou os []

   /* val lista = arrayOf("Artur", 32, "Lia", 31, "Enrico", 7)
    println(lista.get(3)) ou println(lista[3])*/

// adiocnando itens no array com o plus. Mas ele cria uma nova lista e coloca o item

    /*
    val lista = arrayOf("Artur", 32, "Lia", 31, "Enrico", 7)
    val novaLista = lista.plus("Clarice")
    novaLista.forEach { item ->
        println(item)
    }
     */

// O size é para ver o tamanho da lista

    /*
        val lista = arrayOf("Artur", 32, "Lia", 31, "Enrico", 7)
        println(lista.size)
     */

// O metodo indexOf nos passamos o elemento e ele retorna qual o identificador dele na lista

    /*
        val lista = arrayOf("Artur", 32, "Lia", 31, "Enrico", 7)
        println(lista.indexOf("Lia"))
     */

// O metodo first pega o primeiro elemento da lista e o last pega o ultimo elemento da lista

    /*
        val lista = arrayOf("Artur", 32, "Lia", 31, "Enrico", 7)
        println(lista.first())
        println(lista.last())
     */

// O metodo contains irá verificar se existe um item dentro da lista. Ele retorna true ou false

        /*val lista = arrayOf("Artur", 32, "Lia", 31, "Enrico", 7)
        println(lista.contains("Artur"))*/

// Diferença de arrays e collections

/*
    Coleções(collection) serve para armezenar listas de itens
    Dentro dele tem List, Set e Map. Eles são imutaveis. Ou seja, uma vez criado, não é possivel mudar, adicionar ou remover algo da lista. Podemos apenas alterar um item
    Dentro dele, também tem as variações que são mutaveis. São o MutableList, MutableSet e o MutableMap. Neles é possivel mudar, alterar, adicionar ou remover algo na lista
    As listas mutaveis, tem novos metodos, como o .add, o .remove e o .clear
 */