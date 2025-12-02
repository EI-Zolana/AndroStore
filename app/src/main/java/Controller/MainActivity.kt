package Controller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pt.iade.ei.androstore.R
import pt.iade.ei.androstore.ui.theme.AndroStoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroStoreTheme {
                   MainActivityView()

            }

        }

    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainActivityView(){


        Scaffold(
            topBar = {
                TopAppBar(
                    colors = topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary,
                    ),
                    title = {  }
                )
            },
            bottomBar = {
                BottomAppBar(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    contentColor = MaterialTheme.colorScheme.primary,
                ) {

                }
            }
        ) { innerPadding ->
            Column (modifier = Modifier.padding(all = 8.dp)
                .padding(innerPadding)){
            Text(
                text = "Andro Store"
            )
                Card {

                    Box( ){

                        Image(
                            painter = painterResource(R.drawable.ufc),
                            contentDescription = "Imagem do campeão"
                        )

                        Column( modifier = Modifier.align(Alignment.BottomStart))
                        { Text(
                            text = "EA SPORT UFC 3"
                        )
                        }
                    }

                }

                Card {

                    Box( ){

                        Image(
                            painter = painterResource(R.drawable.ufc),
                            contentDescription = "Imagem do campeão"
                        )

                        Column( modifier = Modifier.align(Alignment.BottomStart))
                        { Text(
                            text = "EA SPORT UFC 3"
                        )
                        }
                    }

                }

            }

        }
    }








@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroStoreTheme {
        MainActivityView()
    }
}