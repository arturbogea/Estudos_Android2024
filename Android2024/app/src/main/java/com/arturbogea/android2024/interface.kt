package com.arturbogea.android2024

fun main() {

    val devAndroid = DesenvolvedorAndroid()
    devAndroid.comer()

    val jornalista = Jornalista()
    jornalista.comer()

}

interface Presidenciavel{
    fun candidatarSe()
}

abstract class Pessoa{
    fun comer() = println("comer")

    //abstract fun candidatarSe() = println("candidatar-se")
}

class DesenvolvedorAndroid : Pessoa(){
    fun programar() = println("programar")
}
class DesenvolvedorWeb : Pessoa(){
    fun programar() = println("programar")
}
class Jornalista : Pessoa(), Presidenciavel {
    fun escreverNoticia() = println("escrever noticia")

    override fun candidatarSe() {
        println("candidato")
    }

}
class FuncionarioPublico : Pessoa(){}