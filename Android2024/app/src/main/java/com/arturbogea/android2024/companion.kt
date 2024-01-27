package com.arturbogea.android2024

fun main() {

    //val usuario = UsurarioLogado()
    //usuario.verficarUsuarioLogado()

    val retorno = UsurarioLogado.verficarUsuarioLogado()

    println("usuario logado: $retorno")

    // criando uma instancia ou objeto
    //val fusca = Carro("Fusca", 110)
    //fusca.exibirInformacoes()
    //se abaixo eu pegar o fusca e tentar instanciar, não vai aparecer os atributos do companion.
    //pois como foi criado um atributo e uma instancia, ele é um atributo

    //Agora se colocamos a Carro. ai já aparece.


    //para utilizar o companion, não preciso instanciar a classe. Abaixo segue o novo modelo.
    /*
    var ferrari = Carro("Ferrari", 260)
    ferrari.exibirInformacoes()*/


}
/* deixei como comentario, pois iremos seguir com outro teste.
class Carro(
    var modelo: String = "",
    var velocidade: Int = 0
){

    //tudo colocado dentro de companio objetc, não será preciso mais instanciar
    companion object{
        const val VELOCIDADE_MAX_PERMITIDA = 120

        fun exibirVelMaxPermitida(){
            println("A velocidade máxima permitida na via é de ${Carro.VELOCIDADE_MAX_PERMITIDA} km/h")
        }
    }

    fun exibirInformacoes(){
        println("Informações: $modelo e $velocidade km/h")
    }

}
 */

class UsurarioLogado(){

    /*Aqui podemos verificar o usuario se ele está logado sempre. Agora vou colocar o exemplo com o companion, para não ficar instanciado sempre
    fun verficarUsuarioLogado(): Boolean{
        //verificação
        return true


    } */

    companion object{
        fun verficarUsuarioLogado(): Boolean{
            //verificação
            return true
        }
}




}






