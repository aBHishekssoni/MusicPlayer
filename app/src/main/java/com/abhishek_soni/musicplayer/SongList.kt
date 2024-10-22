//package com.abhishek_soni.musicplayer
//
//import android.graphics.drawable.Icon
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.basicMarquee
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.horizontalScroll
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Add
//import androidx.compose.material.icons.filled.Refresh
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.Card
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.SegmentedButtonDefaults.Icon
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.material3.TextFieldDefaults
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.saveable.rememberSaveable
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.shadow
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.google.android.play.integrity.internal.i
//
////import androidx.test.espresso.base.Default
////@Preview
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun SongList(modifier: Modifier = Modifier) {
//    Box (
//        modifier = Modifier.fillMaxSize()
//    ){
//    Column(
//        modifier = modifier
//            .background(color = Color.Yellow)
//    ) {
//        Row(
//            modifier = modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//
//            var text by rememberSaveable { mutableStateOf("") }
//            TextField(
//                value = text, onValueChange = { text = it },
//                label = { Text(text = "Looking for a song...") },
//                shape = RoundedCornerShape(10.dp),
//                colors = TextFieldDefaults.outlinedTextFieldColors(
//                    containerColor = Color.White,
//                    focusedBorderColor = Color.Transparent,
//                    unfocusedBorderColor = Color.Transparent,
//                    unfocusedLabelColor = Color(0xFF5e5e5e),
//                    focusedLabelColor = Color(0xFF5e5e5e),
//                ),
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(start = 24.dp, end = 24.dp, top = 24.dp)
//                    .shadow(3.dp, shape = RoundedCornerShape(50.dp))
//                    .background(color = Color.White, CircleShape)
//            )
//        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp)
//                .horizontalScroll(rememberScrollState()),
//
//            ) {
//
//
//            Card(
//                modifier = Modifier
////                .fillMaxWidth()
//                    .padding(4.dp)
//            ) {
//                Text(
//                    text = "Favourite Songs",
//                    style = MaterialTheme.typography.titleLarge,
//                    modifier = Modifier.padding(6.dp)
//                )
//            }
//
//            Card(
//                modifier = Modifier
////                .fillMaxWidth()
//                    .padding(4.dp)
//            ) {
//                Text(
//                    text = "Songs playlist",
//                    style = MaterialTheme.typography.titleLarge,
//                    modifier = Modifier.padding(6.dp)
//                )
//            }
//
//            Card(
//                modifier = Modifier
////                .fillMaxWidth()
//                    .padding(4.dp)
//            ) {
//                Text(
//                    text = "Resent Songs",
//                    style = MaterialTheme.typography.titleLarge,
//                    modifier = Modifier.padding(6.dp)
//                )
//            }
//
//        }
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp)
//                .horizontalScroll(rememberScrollState()),
//        ) {
//            Text(
//                text = "Songs",
//                style = MaterialTheme.typography.titleLarge,
//                modifier = Modifier.padding(12.dp).clickable{}, fontWeight = FontWeight.Bold
//            )
//            Text(
//                text = "Videos",
//                style = MaterialTheme.typography.titleLarge,
//                modifier = Modifier.padding(12.dp).clickable{}, fontWeight = FontWeight.Bold
//            )
//            Text(
//                text = "Artists",
//                style = MaterialTheme.typography.titleLarge,
//                modifier = Modifier.padding(12.dp).clickable{}, fontWeight = FontWeight.Bold
//            )
//            Text(
//                text = "Albums",
//                style = MaterialTheme.typography.titleLarge,
//                modifier = Modifier.padding(12.dp).clickable {}, fontWeight = FontWeight.Bold
//            )
//            Text(
//                text = "Folders",
//                style = MaterialTheme.typography.titleLarge,
//                modifier = Modifier.padding(12.dp).clickable{}, fontWeight = FontWeight.Bold
//            )
//        }
//
//    }
//}
//
//}
//
//@Preview
//@Composable
//fun Song(modifier: Modifier = Modifier) {
//    Box(
//       modifier =  Modifier.fillMaxWidth()
//           .padding(12.dp,6.dp)
//    ){
//        Row{
//            Image(
//                painter = painterResource(id = R.drawable.music),
//                contentDescription = null,
//                modifier = Modifier.size(60.dp).padding(4.dp)
//            )
//            Column {
//                Text(
//                    text = "name",
//                    style = MaterialTheme.typography.bodyLarge,
//                    fontSize = 30.sp,
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier.basicMarquee().padding(6.dp)
//                )
//                Text(
//                    text = "Artist",
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 25.sp,
//                    color = Color.Blue.copy(alpha = .6f)
//                )
//            }
//        }
//
//    }
//
//}