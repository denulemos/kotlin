fun main(args: Array<String>) {

  // While
  //imprimir hello 5 veces
  var i = 1

  while (i <= 5) {
      println("Hello")
      i++
  } 

    var x = 0
      while (x<=10){
       if(x == 8) println(x)
       x = x + 2
   }

   // Do While
   var y = 1
       
       do{
         print("Estoy adentro del do while")  
       }while(y!=1)
       
       
       // uso de break
       var sum = 0
    i = 1
    while (i<=100) {
        sum += i
        i++
        if(sum > 1000) {
            break
        }
    }
    println(sum) // 1035

    // Uso de continue
     sum = 0
     i = 1
    while (i<=100) {
        i++
        if(i%2 != 0) {
            continue
        }
        sum += i
    }
    println(sum) //2550
   }