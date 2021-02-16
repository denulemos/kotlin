//Debe ser una clase abierta para que pueda ser heredada
open class Frutas(){
    
    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    var numHojas:Int = 0
    
    constructor(color:String,sabor:String,precio:Int):this(){
       this.color = color
       this.sabor = sabor
       this.precio = precio
    }
    
    constructor(color:String,sabor:String,precio:Int,numHojas:Int):this(){
       this.color = color
       this.sabor = sabor
       this.precio = precio
        this.numHojas = numHojas
    }
    
    fun pudrirse(){
        
      print("La fruta se esta pudriendo")  
        
    }
}

//HERENCIA
class FrutasConGrasa():Frutas(){
   var cantidadGrasa:Int = 0
  
   constructor(grasa:Int):this(){
      this.cantidadGrasa = grasa
   }    
}

open class User(var name: String, var age: Int) { // Poniendo Open permitimos heredar de User
}
class Admin(name: String, age: Int): User(name, age) {
}
class Moderator(name: String, age: Int, var country: String): User(name, age) {
}

class User2(var name: String, private var age: Int) {
   fun getAge():Int {
       if(age < 18)
           return 18
       else 
           return age
   }
   fun setAge(a: Int) {
       if(a < 0) 
           age = 18
       else
           age = a
   }
}

fun main(args: Array<String>) {
   var manzana = Frutas("Rojo","Dulce",4)
   var aguacate = FrutasConGrasa(5)

   aguacate.color = "verde"

   println(aguacate)

   aguacate.pudrirse()

   val b = Moderator("Amy", 23, "USA")
   println(b.country)

   val u1 = User2("Amy", 23)
    u1.setAge(42)
    println(u1.getAge())
}