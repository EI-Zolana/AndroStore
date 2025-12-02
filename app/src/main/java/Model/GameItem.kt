package Model

import java.io.Serializable


data class GameItem(
    val id: String,
    val name: String,
    val iconRes: Int,
    val description: String,
    val price: Double
) : Serializable