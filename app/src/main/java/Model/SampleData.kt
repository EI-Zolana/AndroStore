package Model

object SampleData {
    val games = listOf(
        Game(
            id = "game1",
            title = "EA SPORT UFC 3",
            subtitle = "MMA",
            coverRes = R.drawable.cover.ufc,
            description = "O melhor esporte de combate do mundo",
            item = listOf(
                GameItem("Lutador", " Um novo lutador com habilidades extraordinária", 7.8),
                GameItem("Rosto", "Operação", 9.17),
                GameItem("treinamento", "Aprimoramento da habilidade ", 30.99)
            ) //tentando resolver o erro do meu item
            // o que ficou para resolver, listOf e o gameItem
            // bug e mais bug
        ),
        Game(
            id = "game2",
            title = "The Warrior",
            subtitle = "Ação e muito mais",
            coverRes = R.drawable.cover_warrior,
            description = "Seja um guerreiro e desperte o melhor que há em ti",
            item = listOf(
                GameItem("Lutador", " Um novo lutador com habilidades extraordinária", 7.8),
                GameItem("Rosto", "Operação", 9.17),
                GameItem("treinamento", "Aprimoramento da habilidade ", 30.99)
            )
        )

    )
}