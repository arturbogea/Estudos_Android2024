package com.arturbogea.android2024

fun main() {

    //tela de compras

    val pedido = Pedido(125.90, "calça jeans")
    pedido.statusPedido = StatusPedido.PAGAMENTO_CONFIRMADO

    if (pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO){
        println("O seu pedido foi realizado")
    }else if (pedido.statusPedido == StatusPedido.PAGAMENTO_CONFIRMADO){
        println("O seu pagamento foi confirmado")
    }else if (pedido.statusPedido == StatusPedido.PEDIDO_ENVIADO) {
        println("O seu pedido foi enviado")
    }else if (pedido.statusPedido == StatusPedido.PEDIDO_ENTREGUE) {
        println("O seu pedido foi entregue")
    }



}

enum class StatusPedido{
    AGUARDANDO_APROVACAO,
    PEDIDO_REALIZADO,
    PAGAMENTO_CONFIRMADO,
    PEDIDO_ENVIADO,
    PEDIDO_ENTREGUE
}


//aguardando_aprovacao, pedido_realizado, pagamento_confirmado, pedido_enviado, pedido_entregue
class Pedido(var total: Double = 0.0,
             var itens: String = "",
             var statusPedido: StatusPedido = StatusPedido.AGUARDANDO_APROVACAO){


}