package com.example.hearsounds2.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import com.example.hearsounds2.models.Order
import com.example.hearsounds2.models.Product
import com.example.hearsounds2.models.User
//import com.example.hearsounds2.navigation.ROUTE_HOME
import com.example.hearsounds2.navigation.ROUTE_LOGIN
import com.example.hearsounds2.navigation.ROUTE_PRODUCT
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class AuthViewModel (var navController:NavHostController,var context:Context) {
    var mAuth: FirebaseAuth
    val progress: ProgressDialog

    init {
        mAuth = FirebaseAuth.getInstance()
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait")

    }

    fun signup(email: String, pass: String, confpass: String) {
        progress.show()
        if (email.isBlank() || pass.isBlank() || confpass.isBlank()) {
            progress.dismiss()
            Toast.makeText(context, "Please email and password cannot be blank", Toast.LENGTH_LONG)
                .show()
            return
        } else if (pass != confpass) {
            Toast.makeText(context, "Password do not match", Toast.LENGTH_LONG).show()
            return
        } else {
            mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                if (it.isSuccessful) {
                    val userdata = User(email, pass, mAuth.currentUser!!.uid)
                    val regRef = FirebaseDatabase.getInstance().getReference()
                        .child("Users/" + mAuth.currentUser!!.uid)
                    regRef.setValue(userdata).addOnCompleteListener {


                        if (it.isSuccessful) {
                            Toast.makeText(context, "Registered successfully", Toast.LENGTH_LONG)
                                .show()
                            navController.navigate(ROUTE_PRODUCT)
                        } else {
                            Toast.makeText(context, "${it.exception!!.message}", Toast.LENGTH_LONG)
                                .show()
                            navController.navigate(ROUTE_LOGIN)
                        }
                    }
                } else {
                    navController.navigate(ROUTE_LOGIN)
                }
            }
        }
    }

    fun login(email: String, pass: String) {
        progress.show()
        mAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "Successfully logged in", Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_PRODUCT)
            } else {
                Toast.makeText(context, "${it.exception!!.message}", Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_LOGIN)
            }
        }
    }




    private fun createOrder(product: Product): Any? {



        return product
    }
    fun checkout(product: Product, name: String, cardNumber: Number, expirationDate: Number, cvv: Number) {
        progress.show()

        val cardNumberLong = cardNumber.toLong()
        val expirationDateLong = expirationDate.toLong()
        val cvvLong = cvv.toLong()

        if (name.isBlank() || cardNumberLong <= 0 || expirationDateLong <= 0 || cvvLong <= 0) {
            progress.dismiss()
            Toast.makeText(context, "Please fill in all payment details", Toast.LENGTH_LONG).show()
            return
        } else {

            val orderData = createOrder(product)
//            val orderData = Order(product)
            val orderRef = FirebaseDatabase.getInstance().getReference("orders")

            val orderKey = orderRef.push().key ?: ""

            orderRef.child(orderKey).setValue(orderData).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(context, "Order placed successfully", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(context, "${task.exception?.message}", Toast.LENGTH_LONG).show()
                }
                progress.dismiss()
            }
        }
    }





    fun saveOrder(order: Order) {
        val database = FirebaseDatabase.getInstance()
        val ordersRef: DatabaseReference = database.getReference("orders")

        val orderKey = ordersRef.push().key ?: ""

        ordersRef.child(orderKey).setValue(order)
            .addOnSuccessListener {
                // Order saved successfully
                println("Order saved successfully")
            }
            .addOnFailureListener {
                // Error occurred while saving the order
                println("Error saving order: ${it.message}")
            }
    }



}

class MyViewModel : ViewModel() {

}