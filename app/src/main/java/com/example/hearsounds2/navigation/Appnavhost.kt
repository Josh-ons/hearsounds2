package com.example.hearsounds2.navigation

//import com.example.vulaiphones.ui.theme.Screens.products.ProductScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hearsounds2.ui.theme.Screens.checkout.CheckoutScreen
import com.example.hearsounds2.ui.theme.Screens.login.LoginScreen
import com.example.hearsounds2.ui.theme.Screens.products.ProductScreen
import com.example.hearsounds2.ui.theme.Screens.register.RegisterScreen
import com.example.hearsounds2.ui.theme.Screens.splashscreen.SplashScreen
import com.example.hearsounds2.ui.theme.Screens.checkout.CheckoutScreen
import com.example.hearsounds2.ui.theme.Screens.login.LoginScreen
import com.example.hearsounds2.ui.theme.Screens.products.ProductScreen
import com.example.hearsounds2.ui.theme.Screens.register.RegisterScreen
import com.example.hearsounds2.ui.theme.Screens.splashscreen.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),
               startDestination:String= ROUTE_SPLASHSCREEN) {
    NavHost(navController = navController, modifier = modifier, startDestination = startDestination){
        composable(ROUTE_SPLASHSCREEN) {
            SplashScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_PRODUCT){
            ProductScreen(navController)
        }
        composable(ROUTE_CHECKOUT){
            CheckoutScreen(navController)
        }





    }

}


