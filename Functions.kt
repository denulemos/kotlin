fun welcome(name: String) {
    println("Hello, " + name)
}
fun sum(x: Int, y: Int) {
    println(x+y)
}
fun sumReturn (x: Int, y: Int): Int { // Funcion con return
    return (x+y)
}
fun main(args: Array<String>) {
    welcome("James")
    sum(8, 5)
    welcome("Amy")
    var result = sumReturn(8, 42)
    println(result)

    // Funcion anonima
    val f: (Int, Int) -> Int = { a, b -> a+b } // Recibe 2 ints (a y b) y devuelve 1 int
    result = f(8, 42)
    println(result)
}