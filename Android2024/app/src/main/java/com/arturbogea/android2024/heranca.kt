package com.arturbogea.android2024

fun main() {

    val cao = Cao()
    //o metodo correr, está sendo chamado da classe filha
    cao.correr()



    val passaro = Passaro()
    passaro.correr()



}

open class Animal{ //classe pai

    var cor: String = ""
    var tamanho: String = ""
    var peso: Double = 0.0

    //o cao e o passaro correm de maneiras diferentes. Então vamos utilizar o polimorfismo
    open fun correr() {
        println("Correndo como um ")
    }
    fun dormir() {
        println("Dormindo")
    }
}

class Cao : Animal(){ //subclasse ou clase filha
    // posso criar metodos especificos para cada classe, onde não é preciso herdar
    fun latir() = println("Latindo")

    override fun correr(){ // aqui vamos modificar o metodo da classe pai, para se adaptar a classe filho.
        super.correr() // aqui ele executa o metodo da clsse principal e logo em seguida e chama a sobreposição
        println("cachorro de 4 patas")
    }
}

class Passaro : Animal(){ //subclasse ou clase filha
    fun voar() = println("Voando")

    override fun correr(){ // aqui vamos modificar o metodo da classe pai, para se adaptar a classe filho.
        super.correr()
        println("ave de 2 perninhas")
    }
}