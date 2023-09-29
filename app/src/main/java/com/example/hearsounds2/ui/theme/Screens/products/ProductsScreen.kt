package com.example.hearsounds2.ui.theme.Screens.products

import com.example.hearsounds2.navigation.ROUTE_CHECKOUT
import com.example.hearsounds2.ui.theme.HearSounds2Theme

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.hearsounds2.R


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProductScreen(navController:NavHostController) {
    var quantity by remember { mutableStateOf(1) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Product Page")
                },
//                navigationIcon = {
//                    IconButton(
//                        onClick = { /* Handle navigation icon click */ }
//                    ) {
//                        Icon(
//                            painter = painterResource(id = R.drawable.i15),
//                            contentDescription = null
//                        )
//
//                    }
//                },
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            item {
                Image(
                    painter = painterResource(id = R.drawable.airpods),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "AirPods Pro",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: ksh38000",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }

//

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "Apple AirPods Pro (2nd Generation) Wireless Earbuds," +
                            " Up to 2X More Active Noise Cancelling, Adaptive Transparency," +
                            " Personalized Spatial Audio, MagSafe Charging Case," +
                            " Bluetooth Headphones for iPhone",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        navController.navigate(ROUTE_CHECKOUT)

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.akgbuds),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "AKG Buds",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $149.95",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "AKG N400NC TWS headphones meld reference sound and best-in-class " +
                            "Active Noise Cancelling technology in a refined, true wireless form factor. " +
                            "Lightweight and waterproof, they play inspiring sound for 12 hours (combined playtime)," +
                            " while being conveniently noise and wire-free. Their minimalistic design features " +
                            "an all-function touch panel to easily manage calls and music, or to access the " +
                            "virtual assistants for hands-free help. Their oval, ergonomic shape allows to enjoy" +
                            " their pure, clear sound in all comfort. The sleek charging case provides convenient" +
                            " wireless and quick charging (10 minutes for an hour of playback). Plus, the N400NC " +
                            "TWS headphones have all you need to enjoy your Samsung device and its features, like the " +
                            "Bixby virtual assistant or to seamlessly connect to the Samsung ecosystem via the Multi " +
                            "Device Experience technology. Bring studio sound with you.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.headphones),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Airpod Max Caviar Gold",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $108000",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "Available in “Gold White” and “Gold Black,” the luxury take on the headphones blends high-quality" +
                            " sound with eye-catching expensive style. Caviar put its design together to emphasize " +
                            "“the status of the owners and their impeccable taste.” The expensive upgraded AirPods Max " +
                            "headphones are crafted with 750 grams of 18 Carat yellow gold accented by crocodile leather." +
                            " Each precious accessory comes complete with two gold rings with Caviar inscriptions applied " +
                            "to the headband.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.metabuds),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "metabuds",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $74.99",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "Soundcore VR P10 Wireless Gaming Earbuds-Low Latency, Meta Officially Co-branded, " +
                            "Dual Connection, 2.4GHz Wireless, USB-C Dongle Included-Compatible with Meta Quest" +
                            " 2, Steam Deck, PS4, PS5, PC, Switch",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.multicolorpods),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Flash sale",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $799",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "We also have a flash sale. We offer various earphones and wireless earphones " +
                            "we can also refer you to another company to get a free iphone 15 pro ",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.powerbeatspro),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Powerbeatpro",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $250",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "Powerbeats Pro supports spatial audio for immersive music – delivering a surround " +
                            "sound experience that you can take with you anywhere.Each earbud has up to " +
                            "9 hours of listening time, so you can keep your music going." +
                            "With the charging case, you’ll get more than 24 hours of combined playback." +
                            "And with Class 1 Bluetooth® technology, these wireless earbuds offer extended " +
                            "range and fewer dropouts, so they stay connected as you keep moving.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.soundpeats),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "soundpeats",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $37",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp))
                    }
                }
            }



            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "SoundPEATS Upgraded TrueFree Plus True Wireless Earbuds Bluetooth 5.3 Earphones " +
                            "with Built in Mic in-Ear Stereo Headphones for Sport, Deep Bass, Binaural" +
                            " Calls, One-Step Pairing, 56H Playtime",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.oraimo),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Oraimo",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $30",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "Pure Bass: Employing oraimo premium drives, conch earphone generates bass that is deep and powerful.\n" +
                            "HD Sound: The central diaphragm delivers clear and natural sound with rich detail, so you can immerse yourself completely in your music.\n" +
                            "Single Button Control: The single-button remote and mic allows for easy music control and hands-free calls.\n" +
                            "Comfort Ear-tips: Seek ergonomics design ear-tips add unprecedented comfort to the listener’s experience – allowing a longer, more enjoyable experience.\n" +
                            "Pure Bass: Employing oraimo premium drives, conch earphone generates bass that is deep and powerful.\n" +
                            "HD Sound: The central diaphragm delivers clear and natural sound with rich detail, so you can immerse yourself completely in your music.\n" +
                            "Single Button Control: The single button remote and mic allows for easy music control and hands-free calls.\n" +
                            "Comfort Ear-tips: Seek ergonomics design ear-tips adds unprecedented comfort to the listener’s experience – allowing a longer, more enjoyable experience.\n" +
                            "\n" +
                            "Microphone: Yes\n" +
                            "Impedance: 16OHM\n" +
                            "Sensitivity: 102+/-3db\n" +
                            "Frequency: 20-20kHz\n" +
                            "Cable Length: 1.2m\n" +
                            "Plug Type: 3.5 mm",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.powerbeatspro),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "1231231231221231223 ",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $699",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }

//

            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "12341234123412341234123412334123",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.bluetoothspeaker1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Compspeakers",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $79",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }


            item {
                Text(
                    text = "Description ",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "1. Bluetooth   5.0- Wirelessly connect to  smartphones or tablets to the bluetooth speaker and take turns playing powerful stereo sound. \n" +
                            "2. Battery type :1200mah Lithium-ion Polymer 6-8 hours of playtime(varies by volume level and content) \n" +
                            "3. Take crystal clear calls from your HIFI speaker  \n" +
                            "4. Fablic stripe Speaker Hoursing, unique and fashion style \n" +
                            "5. Portable design with hanging strip, perfect for outdoor, indoor, travel and carring \n" +
                            "6. Support FM Function, this speaker can help yo to seacrh the radio station  \n" +
                            "7. Support Mico SD Card, this bluetooth speaker is not only a Bluetooth Speaker but also a MP3 Player \n" +
                            "8. With AUX Cable, this speaker can connected with TV, Computer, Laptops, Tablets, all kinds of 9. 9. Cell Phones which have 3.5mm Audio Port \n" +
                            "10. Built Intelligent energy-saving system, This Bluetooth Speaker will turn off automatically if disconnenct under Bluetooth Mode \n" +
                            "11. In a Word, this is not only Bluetooth Speaker and also a perfect loundspeaker desivce, and at the same it's a MP3 Player, FM Radio, and A Wired Speaker\n" +
                            "12. With mic for hands-free phone call function\n" +
                            "\n" +
                            "\n" +
                            "Output power: 10W\n" +
                            "Bluetooth Version: V5.0\n" +
                            "Built in Voltage: 3.7V\n" +
                            "Frequencey Response: 150HZ-20KHZ\n" +
                            "Play Mode: Bluetooth, AUX, TF Cards\n" +
                            "Size: 75.5 X 75.5 X 161.6mm\n" +
                            "Signal-to-noise ratio: ≥90DB\n" +
                            "Battery Capacity: 1200mAH\n" +
                            "Charging Voltage: 5V/500mA\n" +
                            "Play time: 6-8H ",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.bluetoothspeaker2),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "MusicStarRing",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $1700",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }



            item {
                Text(
                    text = "Description",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "Wireless Version: V5.0 - Working Distance: 10 Meters - Speaker Power: 5W - Playing" +
                            " Time: About 2-3 Hours - Battery Capacity: 1200mAh - Speaker Unit: 4 Ω 66mm" +
                            " - Weight: 523g- Support: Wireless, USB Pendrive, TF Card, AUX  FEATURES: -" +
                            " Wireless V5.0 Speaker - Superior Stereo Sound - Shockingly Big Sound - " +
                            "Crystal Clear Sound - Small & Portable - Stylish Design  What's in the box: 1 x " +
                            " Speaker (Color Depends on Purchase) 1 x Micro USB Cable 1 x AUX Cable 1 x Manual",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.sonywireless),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Sonywireless",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $99",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "-",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
//                        modifier = Modifier.size(30.dp),
                    ) {
                        Text(
                            text = "+",
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp)
                        )
                    }
                }
            }


            item {
                Text(
                    text = "Description ",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "The best truly wireless noise canceling2 headphones on the market.\n" +
                            "Astonishing sound quality with High-Resolution Audio.\n" +
                            "Sony’s best ever call quality3 with AI based noise reduction algorithm and bone conduction sensor.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }
        }



    }
}



@Preview
@Composable
fun Produvtpreview() {
    HearSounds2Theme {
        ProductScreen(rememberNavController())
    }

}

