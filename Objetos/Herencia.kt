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


fun main(args: Array<String>) {
   var manzana = Frutas("Rojo","Dulce",4)
   var aguacate = FrutasConGrasa(5)

   aguacate.color = "verde"

   println(aguacate)

   aguacate.pudrirse()
}