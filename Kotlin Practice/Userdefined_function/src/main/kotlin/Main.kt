fun greetings(name: String) : String
{
   return ("welcome to kotlin $name!")

}

fun main() {
    println("Hello World!")
    val greet = greetings("firoz")
    println(greet)
}