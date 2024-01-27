package com.arturbogea.android2024

fun main() {

    /*val matematica = Matematica()
    var retorno = matematica.somar(10, 18)*/
    calcular( ::somar )
    var result = somar(5, 8)
    println(result)


    //println(retorno)


}

class Matematica{

    fun somar(n1: Int, n2: Int) : Int{
        return n1 + n2
    }

}

fun somar(n1: Int, n2: Int) : Int{
    return n1 + n2
}

//passando uma função como parametro
fun calcular( somar: (Int, Int) -> Int ){

}