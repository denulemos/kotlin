fun main (args: Array<String>){
    var age = 24
    if (age >= 18) {
        println("Welcome")
    }
    else if (age < 10){
        println("Sos menor de 10 años")
    }
    else{
        println("Sos menor")
    }

    var a = 123
    var b = 11
    var c = 5
    var numeroMayor:Int
    
   numeroMayor = if(a>b && a>c) a else if(b>a && b>c) b else c // Condicional en una sola linea
    
   println("El numero mayor de todas mis variables es: $numeroMayor") 

}