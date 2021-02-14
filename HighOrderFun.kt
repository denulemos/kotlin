/*
Una funcion puede recibir a otra funcion como argumento, estos son los High Order Functions
Son utiles cuando queremos cambiar el comportamiento de una funcion
*/

fun apply(x:Int, action: (Int) -> Int): Int {
    return action(x)
}

fun main(args: Array<String>) {
    // Action es la funcion que recibe un int y devuelve un int, lo pasamos como anonimo
    println(apply(4, {x -> x*2})) // 8
    println(apply(4, {x -> x/2})) // 2

    val arr = arrayOf(42, 3, 10, 4, 6, 1)  
    val res = arr.filter({ it > 5 }) // Filter es una HOF
    println(res)  // [42, 10, 6]
 
}