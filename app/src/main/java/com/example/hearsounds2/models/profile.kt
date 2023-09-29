package com.example.hearsounds2.models

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.hearsounds2.ui.theme.HearSounds2Theme

data class UserProfile(
    val name: String,
    val email: String,
    val bio: String
)
class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val userProfile = UserProfile(
            name = "Oliver",
            email = "Oliver@example.com",
            bio = "I like coding"
        )

        setContent {
            HearSounds2Theme {
//                ProfilePage(userProfile = userProfile)
            }
        }
    }
}