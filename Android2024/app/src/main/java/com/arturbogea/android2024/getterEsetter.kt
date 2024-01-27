package com.arturbogea.android2024

fun main() {

    val usuario = ContatoPessoa(10, "11995851133", "22988552571")

}

//Getter (conseguir, recuperar) e setter (configurar)


//varargs sempre que for usar outros parametros, eles tem que ir no final, depois de todos os outros parametros. Se for antes, da problema


class ContatoPessoa(val codigo: Int, vararg telefones: String){

}