/*
You are making a car parking software that needs to calculate and output the amount due based on the number of hours the car was parked.
The fee is calculated based on the following price structure:
- the first 5 hours are billed at $1 per hour.
- after that, each hour is billed at $0.5 per hour.
- for each 24 hours, there is a flat fee of $15.

This means, that, for example, if a car parked for 26 hours, the bill should be 15+(2*0.5) = 16.0, because it was parked for 24 hours plus 2 additional hours.
 */

fun main(args: Array<String>) {
    var hours = readLine()!!.toInt()
    var total: Double = 0.0
    
    if (hours >= 24){
    while (hours > 24){
total += 15
        hours -= 24
    }
        
    
    }
    else{
        var i = 0
        while (i < 5 && hours > 0){
            total += 1
            hours -= 1
            i ++
        }
    }

   
        while (hours > 0){
            hours -= 1
            total += 0.5
        }
    
   
  println(total)
    
}