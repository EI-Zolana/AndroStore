package Model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameItem(
    val id: String,
    val name: String,
    val iconRes: Int,
    val description: String,
    val price: Double,
) : Parcelable