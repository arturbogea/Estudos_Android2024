package com.arturbogea.android2024

fun main() {

    val usuario = Usuario("artur")

}

//esse é o construtor primario.
// quando passamod no construtor var nome, ele entende que não é mais um parametro, e sim uma propriedade.
// ai não precisa passar o this no init
class Usuario constructor(var nome: String = "",
                          var sobrenome: String = ""){





    // o this faz referencia ao objeto do construtor
    init { // inicializar algo
        this.nome = nome
        this.sobrenome = sobrenome
        println("Init inicializado")
        println("Nome: $nome, Sobrenome: $sobrenome")
    }

    //abaixo vou passar um construtor que recebe apenas o parametro nome
    //quando criamos um construtor secundario, obrigatoriamente chamamos o primario.

    constructor(nome: String) : this(nome, ""){// construtor secundario
        println("O meu nome é $nome")
    }


}

/* referente a classe acima
    //Propriedades
    //podemos criar metodos com o mesmo nome, mas sua assinatura tem que ser diferente
    fun logar(email: String, senha: String){//cada metedo tem a sua assinatura que é assinatura(nome) e parametros e seus tipos.
        println("Usuario logado com o e-mail: $email e senha: $senha")
    }

    fun logar(numTelefone: String){
        println("Usuario logado com telefone: $numTelefone")
    }
     */