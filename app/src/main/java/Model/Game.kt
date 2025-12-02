package Model

import java.io.Serializable
// data classe game para armazenar os dados
data class Game(
    //usei val para declarar os valores que não quero alterar
    val id: String,
    val title: String,
    val subtitle: String,
    val coverRes: Int,
    val description: String,
    val item: List<GameItem>
): Serializable
