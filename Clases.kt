class Frutas(color:String,sabor:String,precio:Int){    
    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    
    init{
       this.color = color
       this.sabor = sabor
       this.precio = precio
    }
    
    fun pudrirse(){
        
      print("La fruta se esta pudriendo")  
        
    }
    
    
}

class User {
  var name = ""
  var age = 0
  constructor(nm: String) {
    name = nm
  }
  constructor(nm: String, a: Int) {
    name = nm
    age = a
  }
}

fun main(args: Array<String>) {
   var manzana = Frutas("Rojo","Dulce",4) 
   println(manzana.color)  
    manzana.pudrirse()

    val u1 = User("James", 42)
    val u2 = User("Amy")
    println(u1.name)
    println(u2.name)
       
}
