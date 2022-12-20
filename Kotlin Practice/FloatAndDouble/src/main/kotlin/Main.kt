fun add(): String {
    var a :Int  = 1
    var b :Int  = 2
    var c :Int = a + b
    return "addition of two numbers:$c"
}



fun main(args: Array<String>) {
    val myNumber = 2f                     //Float is less precise it is precise till 7 decimal and 32 bit//
    val mySecondNumber = 2.0           //Double is more precise it is precise till 15 decimal and 64 bit//

    println("mynumber = $myNumber and mySecondNumber $mySecondNumber")
    val add = add()
    println("$add")


}