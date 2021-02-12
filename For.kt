fun main(args: Array<String>) {
  
    // Recorrer un array con el for
    var arregloInt = intArrayOf(4,5,6,7,8,9,10,11,12,13,14,15,16,17,18)
 
    for((indice,valor)   in arregloInt.withIndex()) { 
        println("El indice $indice representa el valor de: $valor")
    }
    
    // Iterar caracteres en un String
    val name = "James"
    for (x in name) {
        println(x)
    }
}