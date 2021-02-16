/*
Each day a family consumes 15 liters of water.
Given the number of years as input, you need to calculate and output the amount of water consumed in that period.
 */

fun main(args: Array<String>) {
    var years = readLine()!!.toInt()
    println(years*365*15)
    
}