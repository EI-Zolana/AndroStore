package Model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
// data classe game para armazenar os dados
data class Game(
//Não vou mudar estes valores
    //usei val para declarar os valores que não quero alterar
    val id: String,
    val title: String,
    val subtitle: String,
    val description: String,
    val item: GameItem
): Parcelable
