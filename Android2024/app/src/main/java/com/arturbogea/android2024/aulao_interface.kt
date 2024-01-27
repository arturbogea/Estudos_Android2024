package com.arturbogea.android2024

fun main() {

    val violao: Instrumento = Violao()
    val bateria: Instrumento = Bateria()

    //tela 1(violao)
    val violao1 = Violao()
    val musico1 = Musico(violao)
    violao.sendoTocado()

    println("++++++++++")

    //tela 2(violao)
    val violao2 = Violao()
    val musico2 = Musico(violao)
    violao2.sendoTocado()

    println("++++++++++")

    //tela 3(bateria)
    val violao3 = Bateria()
    val musico3 = Musico(bateria)
    violao3.sendoTocado()

    println("++++++++++")

    //tela 4(guitarra)
    val guitarra = Guitarra()
    val musico4 = Musico(guitarra)
    guitarra.sendoTocado()





}

//DRY -> Dont Repeat Yourself (Não repita codigo) (ok)
//Divisão de responsabilidades (ok)
//Alto Acoplamento e Baixo Acoplamento -> Quando tem uma classe conversa com outra classe, mas o violão está sendo criado diretamente direto de musico (ok)
// Classes devem UTILIZAR outras classes. Não devem criar outra classe (ok)
//A interface é um contrato. Ela irá dizer como as outras classes devem se comportar
//Nesse caso, as outras classes que "herdam" da interface, são obrigado a implementar o metodo sendo tocado. Mas cada classe interna, pode adartar como utilizar do seu jeito
interface Instrumento {

    fun sendoTocado()

}

class Musico(val instrumento: Instrumento){
    fun tocar(){
        val violao = Violao() // auto acomplemento
        println("Musico tocando")
        instrumento.sendoTocado()

    }
}

class Violao : Instrumento { // Dois tipos: Violão, Instrumento
    override fun sendoTocado(){
        println("Utilizando cordas (20 linhas de codigo)")
        println("Para tocar o violão")
    }

    fun ajustarCordas(){
        println("Ajustar cordas")
    }

}

class Bateria : Instrumento { // Dois tipos: Bateria, Instrumento
    override fun sendoTocado(){
        println("Utilizando baquetas (20 linhas de codigo)")
        println("Para tocar a bateria")
    }

    fun ajustarBaquetas(){
        println("Ajustar baquetas")
    }

}

class Guitarra : Instrumento {
    override fun sendoTocado() {
        println("Utilizando cordas (20 linhas de codigo)")
        println("Ajustando o som")
        println("Para tocar a guitarra")
    }

}