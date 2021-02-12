fun main(args: Array<String>) {
    for (i in 2..5) {
        println(i) // 2 3 4 5
    }
    for (x in 'a'..'e') {
        println(x) // a b c d e
    }
    val x = 42
    if(x in 15..100) {
        println("Yes") // El valor x esta entre el rango de 15 y 100?
    }
    val xx = arrayOf(8, 9, 42, 111)
    if(42 in xx) {
        println("Yes") // 42 existe en el array x?
    }
}