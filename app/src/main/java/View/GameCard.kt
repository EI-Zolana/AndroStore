package View


import Model.Game
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GameCard(game: Game, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = onClick), elevation = 4.dp
    )

    {
        Row(modifier = Modifier.padding(12.dp), verticalAlignment = Alignment.CenterVertically) {

            if (game.coverRes != null) {
                Image(
                    painter = painterResource(id = game.coverRes),
                    contentDescription = "${game.title} cover",
                    modifier = Modifier.size(64.dp).clip(RoundedCornerShape(8.dp)),
                    contentScale = ContentScale.Crop
                )
            } else {
                Box(
                    modifier = Modifier.size(64.dp)
                        .background(MaterialTheme.colorScheme.onSurface.copy(0.1f))
                )
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(game.title, style = MaterialTheme.typography.titleLarge)
                Text(game.subtitle, style = MaterialTheme.typography.titleMedium)
            }
        }

    }


}


@Composable
@Preview(showBackground = true)
fun PreviewGameCard() {
    GameCard(game = SampleData.games.first(), onClick =  { })
}