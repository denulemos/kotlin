/*Ciclos When*/
fun main(args: Array<String>) {
    val calificacion = 3
    var resena:String
       
    when(calificacion){
        
        1 -> resena = "No me gusto la comida, me causo malestar."
        2 -> resena = "No me gusto, pero la bebida si"
        3 -> {println("El cliente califico con 3 estrellas")
              resena = "Mediocre"}
        4 -> resena = "Me gusto pero puede mejorar."
        5 -> resena = "La mejor comida mexicana en mucho tiempo"
        else -> resena = "Reseña mal escrita"
      
    }     
        
       print(resena) 

       // When con condicionales y otra sintaxis
       val num = -7
    
    val result = when {
        num > 0 -> "Positive"
        num < 0 -> "Negative"
        else -> "Zero"
    }
    println(result)
       
   }