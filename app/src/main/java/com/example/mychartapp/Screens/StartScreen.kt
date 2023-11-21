package com.example.mychartapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mychartapp.Navigations.HOME_SCREEN


@Composable
fun StartScreen(
    navHostController: NavHostController
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
//        Image(
//            painterResource(id = R.drawable.background), "",
//            contentScale = ContentScale.FillWidth
//        )

        Box(
            modifier = Modifier
                .padding(top = 220.dp)
                .align(Alignment.Center)
                .background(Color.Black)
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 40.dp)
            ) {
                val InterBold = null
                Text(
                    "", TextStyle(
                        fontSize = 36.sp,
                        color = Color.White,
                        fontFamily = InterBold
                    ), Modifier.align(Alignment.CenterHorizontally)
                )
                CustomCheckBox()

            }
        }
        Button(
            onClick = {
                navHostController.navigate(HOME_SCREEN)
            }, modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .align(Alignment.BottomCenter)
                .height(60.dp),
            shape = RoundedCornerShape(100.dp),
//            elevation = ButtonDefaults.elevation(0.dp),
            colors = ButtonDefaults.buttonColors(

            )
        ) {
            val InterBold = null
            Text(
                text = "", style = TextStyle(
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontFamily = InterBold
                ), modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}


@Composable
fun CustomCheckBox() {

    Row(
        modifier = Modifier.padding(vertical = 15.dp)
    ) {
        val Aqua = null
        Box(
            modifier = Modifier
                .size(24.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 10.dp, topEnd = 10.dp, bottomStart = 80.dp, bottomEnd = 80.dp
                    )
                )
                , contentAlignment = Alignment.Center
        ) {
            Icon(
                Icons.Default.Check,
                contentDescription = "",
                modifier = Modifier.size(15.dp),
                tint = Color.Black
            )
        }
        Spacer(modifier = Modifier.width(15.dp))
        val InterSemibold = null
        Text(
           "", TextStyle(
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = InterSemibold
            ), Modifier.align(Alignment.CenterHorizontally)
        )
    }

}

private fun Modifier.Companion.align(centerHorizontally: Alignment.Horizontal): Modifier {
    TODO("Not yet implemented")
}



@Composable
fun Text(text: AnnotatedString, style: TextStyle, modifier: Modifier) {
    TODO("Not yet implemented")
}
@Preview
@Composable
fun startscreen() {
    StartScreen(rememberNavController())

}




