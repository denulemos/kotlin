class User {
    var name = ""
    var age = 0

    // Getter
    get() = field-1
  
    // Setter
    set(value) {
      if(value < 0) {
        field = 18
      }
      else {
        field = value
      }
    }
  } 
  
  fun main(args: Array<String>) {
    val u = User()
    u.age = -4
    println(u.age)
  }