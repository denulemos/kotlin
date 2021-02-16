abstract class User(var name: String, var age: Int) { // Clase Abstracta
    abstract fun display()
}

class Admin(name: String, age: Int): User(name, age) { // Implementamos clase abstracta
    override fun display() {
        println(name + " is " + age + " years old")
    }
}

class Moderator(name: String, age: Int, var country: String): User(name, age) {
    override fun display() { // Todos hacen su version de display() de la clase abstracta
        println(name + " is from " + country)
    }
}

fun main(args: Array<String>) {
    val a = Moderator("James", 42, "USA")
    a.display()
    
    val b = Admin("Amy", 19)
    b.display()
}