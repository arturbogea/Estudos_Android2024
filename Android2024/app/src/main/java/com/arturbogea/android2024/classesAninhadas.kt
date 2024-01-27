package com.arturbogea.android2024

fun main() {

    /*val motorista = Motorista("Artur")
    motorista.exibirDadosMotorista()*/
    //a classe caminhão, não tem ligação direta com a classe motorista. Mas para acessar ela, precisamos acessar a classe motorista

    /*val motorista = Motorista.Caminhao("Scania")
    motorista.exibirDadosCaminhao()*/

    //usando a inner class
    val motorista = Motorista("Artur")
    val caminhao = motorista.Caminhao("Volvo")



}

class Motorista(val nome: String){

    fun exibirDadosMotorista() = println("Motorista: $nome")

    /*class Caminhao(val nomeCaminhao: String){//classe aninhada(Nested Class). Seria uma classe dentro de outra classe
        fun exibirDadosCaminhao() = println("Caminhão: $nomeCaminhao")
    }*/

    //a classe inner ja tem uma relação com a classe motorista. Já se comunica com a classe motorista
    inner class Caminhao(val nomeCaminhao: String){//classe interna(Inner Class). Seria uma classe dentro de outra classe
    fun exibirDadosCaminhao() = println("Caminhão: $nomeCaminhao")
    }
}