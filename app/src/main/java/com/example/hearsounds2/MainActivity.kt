package com.example.hearsounds2

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import coil.compose.rememberImagePainter
import com.example.hearsounds2.navigation.AppNavHost
import com.example.hearsounds2.ui.theme.HearSounds2Theme
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseDatabase.getInstance().setPersistenceEnabled(true)
        setContent {
            Surface(color = MaterialTheme.colorScheme.background, modifier = Modifier.fillMaxSize()) {
                HearSounds2Theme {
                    AppNavHost()
                }
            }
//                Scaffold(
//                    topBar = {
//                        TopAppBar(
//                            title = {
//                                Text(
//                                    text = "GFG",
//                                    modifier = Modifier.fillMaxWidth(),
//                                    textAlign = TextAlign.Center,
//                                    color = Color.White
//                                )
//                            })
//                    })
//                {
//
////                    com.example.hearsounds2.ui.theme.Screens.firebasUI(LocalContext.current)
//                }

        }
    }

}



@Composable
fun FirebasUI(context: Context) {

    // on below line creating
    // variable for message.
    val message = remember {
        mutableStateOf("")
    }
    // on below line creating variable for firebase
    // database and database reference.
    val firebaseDatabase = FirebaseDatabase.getInstance();
    val databaseReference = firebaseDatabase.getReference("Data");

    databaseReference.addValueEventListener(object : ValueEventListener {
        override fun onDataChange(snapshot: DataSnapshot) {
            val value = snapshot.getValue(String::class.java)
            message.value = value!!
        }

        override fun onCancelled(error: DatabaseError) {
            Toast.makeText(context, "Fail to get data.", Toast.LENGTH_SHORT).show()
        }
    })

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color.White),
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
//            painter = rememberAsyncImagePainter(message.value),
            painter = rememberImagePainter(data = message.value),


            contentDescription = "gfg image",

            modifier = Modifier
                .wrapContentSize()
                .wrapContentHeight()
                .wrapContentWidth()
        )
    }
}



