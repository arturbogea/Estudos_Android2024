package com.arturbogea.android2024

fun main() {

    /*var equipamento: Equipamento? = null
    //Aqui o usuario pode ou não escolher um produto

    equipamento = Equipamento("Notebook", 1200.00)*/

    /*var alertaMensagem = AlertaMensagem()
    *//*alertaMensagem.configurarTitulo("Confirmar salvar...")
    alertaMensagem.configurarDescricao("Você tem certeza?")
    alertaMensagem.configurarConfirmar()
    alertaMensagem.configurarCancelar()*//*

    //Daria para utilizar o run, mas a diferença é que é para aplicar uma configuração e o run é para executar alguma coisa.
    *//*
    Eu quero salvar algo no banco de dados. Utiliza o run.
    Eu quero aplicar uma configuração. Utilizo o apply
     *//*
    alertaMensagem.apply {
        configurarTitulo("Confirmar salvar...")
        configurarDescricao("Você tem certeza?")
        configurarConfirmar()
        configurarCancelar()
    }*/

    var lista = listOf("artur","lia", "enrico")
    lista.map { it.uppercase() }.also {objeto -> println(objeto) }

}

//funções de escopo
/*
Não introduz nenhuma nova capacidade técnica. Essas funções podem deixar o codigo mais consiso e de facil leitura. São atalhos para codigos que vocẽ escreve.

let - Utilizado para validações de null. Permite alterar um objeto e caso necessário retorne o objeto alterado.

run - Útil para inicializar um objeto e realizar algumas operações nele.

with - Parecido com o  run. É usado para alterar propriedades de um objeto, mas tem uma sintaxe diferente.

apply - Utilizado para aplicar configurações em objetos

also - Quando aparecer um also no codigo, pode ler " e também faça isso com o objeto ", frequentimente utilizado para executar ações sem modificar o objeto.
 */



/*
Utilizando o let

Quando utilizamos o let, ele retorna como parametro, o objeto produto(it). É como se tivesse utilizado o proprio objeto.

var equipamento: Equipamento? = null
    //Aqui o usuario pode ou não escolher um produto

    equipamento = Equipamento("Notebook", 1200.00)


    /*if (equipamento != null){
        equipamento.preco = 1100.00
        salvarProduto(equipamento)
    }*/

    //a função let pega esse produto e caso ele não esteja nulo, ele usa o item que está como parametro da função lambda. Ou seja, ele faz a mesma coisa que o if acima

    equipamento?.let { item ->
        item.preco = 1100.00
        item.nome = "Dell"
        salvarProduto(equipamento)
    }
     O salvar o produto, é caso precisasse pegar os dados salvar em algum lugar.


    println(equipamento?.nome)
    println(equipamento?.preco)

    salvarProduto(equipamento)

   data class Equipamento(var nome: String, var preco: Double)

    fun salvarProduto(equipamento: Equipamento){
}

 */

/*
 Utilizando o run

Quando utilizamos o run, ele não passa um produto. Ele utiliza o this. É como se tivesse dentro da propria classe

var equipamento: Equipamento? = null
    //Aqui o usuario pode ou não escolher um produto

    equipamento = Equipamento("Notebook", 1200.00)

    // poderiam ter outros metodos dentro. Pois é como se eu tivesse dentro da classe equipamento
    equipamento?.run {
        desativar()
    }
    data class Equipamento(var nome: String, var preco: Double){

 */

/*
 Utilizando o with

 O with tem uma sintaxe diferente. Mas ele retorna o objeto this. Igual ao run.

 var equipamento: Equipamento? = null
    //Aqui o usuario pode ou não escolher um produto

    equipamento = Equipamento("Notebook", 1200.00)

    with(equipamento){
        desativar()
        this
    }


 */

/*
 Utilizando o  apply
 É utilizado para aplicar configurações em objetos

 var alertaMensagem = AlertaMensagem()
    /*alertaMensagem.configurarTitulo("Confirmar salvar...")
    alertaMensagem.configurarDescricao("Você tem certeza?")
    alertaMensagem.configurarConfirmar()
    alertaMensagem.configurarCancelar()*/

    //Daria para utilizar o run, mas a diferença é que é para aplicar uma configuração e o run é para executar alguma coisa.
    /*
    Eu quero salvar algo no banco de dados. Utiliza o run.
    Eu quero aplicar uma configuração. Utilizo o apply
     */
    alertaMensagem.apply {
        configurarTitulo("Confirmar salvar...")
        configurarDescricao("Você tem certeza?")
        configurarConfirmar()
        configurarCancelar()
    }

    class AlertaMensagem{

    fun configurarTitulo(titulo: String){
        println(titulo)
    }

    fun configurarDescricao(descricao: String){
        println(descricao)
    }

    fun configurarCancelar(){
        println("Ação de cancelar")
    }

    fun configurarConfirmar(){
        println("Confirmar")
    }

}

 */

/*
 Utilizando o also.
 Also quer dizer também. Ou seja, conforme o exemplo abaixo. Utilizo o map para deixar todas as letras maiusculas e o also(também faça) println.
 Ele utiliza o it

    var lista = listOf("artur","lia", "enrico")
    lista.map { it.uppercase() }.also {println(it) }

    podemos utilizar o objeto para o retorno

    var lista = listOf("artur","lia", "enrico")
    lista.map { it.uppercase() }.also {objeto -> println(objeto) }

    Acima ele utilizou o map para deixar o texto em maiusculo e o also também imprima
 */


/*data class Equipamento(var nome: String, var preco: Double){

    fun desativar(){
        println("Produto $nome com o preço $preco. Foi desativado")
    }
}

fun salvarProduto(equipamento: Equipamento){
}*/


class AlertaMensagem{

    fun configurarTitulo(titulo: String){
        println(titulo)
    }

    fun configurarDescricao(descricao: String){
        println(descricao)
    }

    fun configurarCancelar(){
        println("Ação de cancelar")
    }

    fun configurarConfirmar(){
        println("Confirmar")
    }

}
