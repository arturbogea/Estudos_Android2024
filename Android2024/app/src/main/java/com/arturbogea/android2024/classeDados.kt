package com.arturbogea.android2024

fun main() {

    val pergunta1 = Pergunta("Qual a pergunta?", 2)
    val pergunta2 = Pergunta("Qual a pergunta?", 2)



    println(pergunta1 == pergunta2)

}

/*Uma data class deve ter pelo menos um construtor
Ela pode ter metodos dentro dela. Ela funciona igual a uma classe normal. A diferença é que ela é focada nos dados.
Normalmente é criada sem as {}
*/
data class Pergunta(val pergunta: String, val respostaCerta: Int)



