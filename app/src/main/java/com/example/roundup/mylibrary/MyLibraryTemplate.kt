package com.example.roundup.mylibrary

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.roundup.R

@Composable
fun MyLibraryTemplate(){
    Surface {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ){
                Box(
                    Modifier
                        .clickable(onClick = {})
                        .padding(16.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.profile_picture),
                        contentDescription = "hoge",
                    )
                }
                Column {
                    Text(
                        text = "Alfred Sisley",
                        modifier = Modifier.paddingFromBaseline(top = 100.dp)
                    )
                    Text(
                        text = "3 minutes ago",
                        modifier = Modifier.offset(x = 4.dp)
                    )
                }
            }
            Box(
                Modifier
                    .padding(16.dp)
                    .clickable(onClick = {})
            ){
                Image(painter = painterResource(id = R.drawable.profile_picture), contentDescription = "hoge")
            }
        }
    }
}