package Model

import View.components.GameCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import pt.iade.ei.androstore.R

object SampleData {
    val games = listOf(
         Game(
             id = "game2",
             title = "The Warrior",
             subtitle = "Ação e muito mais",
             coverRes = R.drawable.warrior,
             description = "Seja um guerreiro e desperte o melhor que há em ti",
             item = listOf(
                 GameItem("Lutador", " Um novo lutador com habilidades extraordinária", R.drawable.espada, "MMA", 9.0),
                 GameItem("Rosto", "Operação", R.drawable.armadura,  "jogo", 9.0),
                 GameItem("treinamento", "Aprimoramento da habilidade ", R.drawable.escudo, "proteção", 20.0)
             )
         ) ,

           /* item = listOf(
                GameItem("Lutador", "Um novo lutador com habilidades extraordinária", 7.8),
                GameItem("Rosto", "Operação", 9.17),
                GameItem("treinamento", "Aprimoramento da habilidade ", 30.99)
            ) //tentando resolver o erro do meu item
            // o que ficou para resolver, listOf e o gameItem
            // bug e mais bug

            */

        Game(
            id = "game2",
            title = "The Warrior",
            subtitle = "Ação e muito mais",
            coverRes = R.drawable.warrior,
            description = "Seja um guerreiro e desperte o melhor que há em ti",
            item = listOf(
                GameItem("Lutador", " Um novo lutador com habilidades extraordinária", 7.8),
                GameItem("Rosto", "Operação", 9.17),
                GameItem("treinamento", "Aprimoramento da habilidade ", 30.99)
            )
        )

    )
}

@Preview(showBackground = true)
@Composable
fun PreviewGameCard(){
    GameCard(game = SampleData.games.first(), onClick =  { }
}