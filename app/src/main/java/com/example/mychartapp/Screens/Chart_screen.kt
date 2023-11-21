package com.example.mychartapp.Screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mychartapp.Data.Chat
import com.example.mychartapp.Data.Person


@Composable
fun ChatScreen(
    navHostController: NavHostController
) {

    var message by remember { mutableStateOf("") }
    val data = navHostController.previousBackStackEntry?.savedStateHandle?.get<Person>("data") ?: Person()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            UserNameRow(
                person = data,
                modifier = Modifier.padding(top = 60.dp, start = 20.dp, end = 20.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 25.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 30.dp, topEnd = 30.dp
                        )
                    )
                    .background(Color.White)
            ) {
                LazyColumn(modifier = Modifier.padding(start = 15.dp, top = 25.dp, end = 15.dp, bottom = 50.dp)){
//                    items(chatList,key={it.id}){
//                        ChatRow(chat = it)
//                    }
                }
            }
        }

        CustomTextField(
            text = message, onValueChange = { message = "" },
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 20.dp)
                .align(BottomCenter)
        )
    }

}

private fun BoxScope.CustomTextField(text: String, onValueChange: () -> Unit, modifier: Modifier) {
    TODO("Not yet implemented")
}

@Composable
fun ChatRow(
    chat: Chat
) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = if (chat.direction) Alignment.Start else Alignment.End
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(100.dp))
//                .background(
//                    if (chat.direction) LightRed else LightYellow
//                ),
//            contentAlignment = Center
        ) {
            val InterRegular = null
//            Text(
//                text = chat.message, style = InterRegular?.let {
//                    TextStyle(
//                        color = Color.Black,
//                        fontFamily = it,
//                        fontSize = 15.sp
//                    )
////                },
//                modifier = Modifier.padding(vertical = 8.dp, horizontal = 15.dp),
//                textAlign = TextAlign.End
//            )
//        }
//        val InterRegular = null
//        Text(
//            "", style = TextStyle(
//                color = Gray,
//                fontFamily = InterRegular,
//                fontSize = 12.sp
//            ),
//            modifier = Modifier.padding(vertical = 8.dp, horizontal = 15.dp),
//        )
    }

}

fun TextStyle(color: Color, fontFamily: Nothing?, fontSize: TextUnit): TextStyle {
    TODO("Not yet implemented")
}

class TextStyle(color: Color, fontFamily: Any, fontSize: Any) {

}

fun Text(text: String, style: Any, modifier: Modifier, textAlign: Any) {

}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    text: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {

//    val Gray400 = null
//    Card(
//        modifier = modifier.fillMaxWidth(),
//        elevation = 0.dp,
//        shape = RoundedCornerShape(164.dp),
//        border = BorderStroke(1.dp, Gray400)
////    ) {
//        TextField(
//            value = text, onValueChange = { onValueChange(it) },
//            placeholder = {
//                val InterRegular = null
//                Text(
//                    text = stringResource(R.string.type_message),
//                    style = TextStyle(
//                        fontSize = 14.sp,
//                        fontFamily = InterRegular,
//                        color = Color.Black
//                    ),
//                    textAlign = TextAlign.Center
//                )
//            },
//            colors = TextFieldDefaults.textFieldColors(
//                unfocusedIndicatorColor = Color.Transparent,
//                focusedIndicatorColor = Color.Transparent
//            ),
//            leadingIcon = { CommonIconButton(imageVector = Icons.Default.Add) },
//            trailingIcon = { CommonIconButtonDrawable(R.drawable.mic) }
//
//        )
    }

}

@Composable
fun CommonIconButton(
    imageVector: ImageVector
) {

    Box(
        modifier = Modifier
            .size(33.dp)
            .clip(CircleShape)
            .background(Yellow), contentAlignment = Center
    ) {
        Icon(
            imageVector = imageVector, contentDescription = "",
            tint = Color.Black,
            modifier = Modifier.size(15.dp)
        )
    }

}

@Composable
fun CommonIconButtonDrawable(
    @DrawableRes icon: Int
) {

    Box(
        modifier = Modifier
            .size(33.dp)
            .clip(CircleShape)
            .background(Yellow), contentAlignment = Center
    ) {
        Icon(
            painter = painterResource(id = icon), contentDescription = "",
            tint = Color.Black,
            modifier = Modifier.size(15.dp)
        )
    }

}

@Composable
fun UserNameRow(
    modifier: Modifier = Modifier,
    person: Person
) {

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row {
            Icon(
                painter = painterResource(id = person.icon),
                contentDescription = "",
                modifier = Modifier.size(42.dp),
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
//                val InterBold = null
//                Text(
//                    text = person.name, style = TextStyle(
//                        color = Color.White,
//                        fontFamily = InterBold,
//                        fontSize = 16.sp
//                    )
//                )
//                val InterRegular = null
//                Text(
//                    text = stringResource(R.string.online), style = TextStyle(
//                        color = Color.White,
//                        fontFamily = InterRegular,
//                        fontSize = 14.sp
//                    )
//                )
            }
        }
        IconButton(
            onClick = {}, modifier = Modifier
                .size(24.dp)
                .align(CenterVertically)
        ) {
            Icon(Icons.Default.MoreVert, contentDescription = "", tint = Color.White)
        }
    }

}

@Preview
@Composable
fun Chartscreenprev() {
    ChatScreen(rememberNavController())

}
