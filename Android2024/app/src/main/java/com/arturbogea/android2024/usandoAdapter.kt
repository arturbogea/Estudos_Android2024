package com.arturbogea.android2024

fun main() {

    val conectorNovoPadrao = ConectorNovoPadrao()

    val conectorAdaptador = ConectorAdaptador(conectorNovoPadrao)

    //ao fazer igual acima com o adaptador. Estamos passando um conector adaptado. Onde ele recebe uma tomada de 3 pinos e adapta para funcionar no de 2
    val tomadaAntiga = TomadaAntiga(conectorAdaptador)
    tomadaAntiga.passarEnergia()

}
//Para entender o adapter, irei utilizar um exemplo padrão do curso
//A primeira classe, seria um tipo de tomada antiga e a segunda classe, é o novo padrão de tomada.

interface Conector {
    fun quantidadePino() : Int
    fun ligarAparelho()
}

class TomadaAntiga (val conector: Conector){
    fun passarEnergia(){
        val qtdPinos = conector.quantidadePino()

        if (qtdPinos == 2){
             conector.ligarAparelho()
            println("Quantidade de pinos: $qtdPinos")
            println("passando energia")
        }else{
            println("Essa tomada só funcina com 2 pinos. Você passou $qtdPinos pinos")
        }


    }
}

class ConectorNovoPadrao : Conector{
    override fun quantidadePino(): Int {
        return 3
    }


    override fun ligarAparelho(){
        println("aparelho ligado")
    }
}

//Vou criar uma classe conector adaptador
//Preciso passar o interface para ele. Ele implementa a interface conector, para que eu possa usar na classe tomada antiga
//Para não repetir codigo no ligar aparelho, a classe conetorAdaptador recebe o conetorNovoPadrão
class ConectorAdaptador(val conectorNovoPadrao: ConectorNovoPadrao) : Conector {
    override fun quantidadePino(): Int {
        return  2
    }

    // ao passar o conectorNovoPadrão para a classe, utilizamos o conetorNovoPadrao.ligaraparelho()
    // com isso aproveito as mesmas linhas de codigo
    override fun ligarAparelho() {
        conectorNovoPadrao.ligarAparelho()
    }
}