package com.arturbogea.android2024

fun main() {



}


fun listaFilmes() : MutableList<Filmes>{
    return mutableListOf(Filmes("O Senhor dos Aneis - O retorno do Rei", 2003, "Fantasia", "ingles"),
        Filmes("The Batman", 2023, "Ação", "inglês"),
        Filmes("O Hobbit", 2012, "Fantasia", "inglês"),
        Filmes("Cidade de Deus", 2001, "Ação", "portugues"),
        Filmes("Historias do dia a dia", 2018, "Drama", "espanhol"),
        Filmes("A Liga da Justiça", 2018, "Ação", "inglês"),
        Filmes("Matrix", 1999, "Ação", "inglês"),
        Filmes("Casa do Lago", 2010, "Drama", "inglês"),
        Filmes("Debi e Loide", 1994, "Comedia", "inglês"),
        Filmes("A Grande Familia", 2008, "Comedia", "portugues")
        )
}

data class Filmes(val nomeFilme: String, val anoEstreia: Int, val genero: String, val idioma: String)


