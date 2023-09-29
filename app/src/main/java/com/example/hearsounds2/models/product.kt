package com.example.hearsounds2.models

class Product {


    var name:String=""
    var quantity:String=""
    var price:String=""
    var id:String=""
    var description:String=""
    val imageResourceId: Int = 0 // Add this property to store the image resource ID


    constructor(name: String, quantity:String, price:String, id: Int){
        this.name=name
        this.quantity=quantity
        this.price=price
        this.id= id.toString()
    }
    constructor()
}


data class Order(
    val product: Product,
    var productId: Product,
    var productName: String,
    val Name: String,
    val Id:Product

)

class MyCheckout {
    fun checkout(product: Product, name: String, cardNumber: Long, expirationDate: Long, cvv: Int) {
        // Your code to process the checkout goes here
    }
}

