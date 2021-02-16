/*
You are working on a eCommerce website and need to make a shipping cost calculator based on the order amount.
The store uses the following cost structure:
For orders in the US:
- $75+ orders have free shipping
- orders less than $75 have a shipping fee of 10% of the total order amount.

For international orders, there is a 15% shipping fee, with a maximum of $50. This means that the maximum shipping fee for an international order is $50.

You need to complete the given shippingCost() function, which takes the order amount and a Boolean indicating whether the order is international or not, and returns the shipping cost for that order.
The return amount should be a Double. */


fun shippingCost(amount: Double, international: Boolean): Double {
    if (international){
        var porcentajex : Double = (15 * amount) / 100
        if (porcentajex > 50.0){
            return 50.0
        }
        else{
            return porcentajex
        }
    }
    else{
        if (amount >= 75.0){
            return 0.0
        }
        else{
            var porcentajexx : Double = (10 * amount) / 100
            return porcentajexx
        }
    }

}


fun main(args: Array<String>) {
    val total = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()    
    println(shippingCost(total, international))
}