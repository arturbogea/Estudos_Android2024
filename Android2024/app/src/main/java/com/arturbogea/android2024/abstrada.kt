package com.arturbogea.android2024

fun main() {
    val cao = Cachorro()
    cao.dormir()

    val passaro = Passaro2()
    passaro.dormir()
}


abstract class Animal2{ //classe pai - super classe - abastrata
    /*
    classe abstrata não precisa escrever o open, pois ela já é pronta para herdar
    ela é utilizar para herdar propriedades e metodos. Não é possivel instanciar
    ela é conhecida como classe abstrada.
    Uma analogia simples é. Classe abstrata é como a plata de uma casa. Não é possivel construir ou morar nela, é algo abstrato
    Já uma classe concreta, é como a casa pronta. Podemos morar nela e construir coisas
     */

    var cor: String = ""
    var tamanho: String = ""
    var peso: Double = 0.0

    /*
     podemos ter metodos abstratos.

    */
    open fun correr() {
        println("Correndo como um ")
    }
    abstract fun dormir() // quando o metodo é definido como abstrado, ele não precisa ter corpo. Ele é obrigado a ter em todas as classes que herdam da classe abstrata
}

class Cachorro : Animal2(){ //subclasse ou clase filha

    fun latir() = println("Latindo")

    override fun correr(){ // aqui vamos modificar o metodo da classe pai, para se adaptar a classe filho.
        super.correr() // aqui ele executa o metodo da clsse principal e logo em seguida e chama a sobreposição
        println("cachorro de 4 patas")
    }

    override fun dormir() {
        println("Dormindo igual ao cachorro")
    }
}

class Passaro2 : Animal2(){ //subclasse ou clase filha
    fun voar() = println("Voando")

    override fun correr(){ // aqui vamos modificar o metodo da classe pai, para se adaptar a classe filho.
        super.correr()
        println("ave de 2 perninhas")
    }

    override fun dormir() {
        println("Dormindo igual a um passaro")
    }
}