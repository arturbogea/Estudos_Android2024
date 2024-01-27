package com.arturbogea.android2024

fun main() {

    //função lambda é apenas {passando parametros para a função é passando aqui dentro da chave, conforme mostra abaixo}
    val funcaoLambda = { nome: String, idade: Int ->
        println("Executar nome: $nome idade: $idade")
    }
    //ao executar, não chamou nada. Para executar, temos que fazemos como abaixo
    // como a função lambda não temos nome, temos que atribuir a uma variavel.
    funcaoLambda("Artur", 32)

}

//criando uma função lambda


fun executar(){
    println("Executar")
}

fun executar2() = println("Executar 2")