fun main() {
    var number: Int   = 22

    val maxIntegerValue = Int.MAX_VALUE  //Int can't store value more than 2147483647
    val minIntegerValue = Int.MIN_VALUE  //Int can't store value less than -2147483648

    println("Int maximum value is : $maxIntegerValue  ")  //1bit--->0 or 1 ,1byte------>8bit,1kb---->1000bytes
    println("Int minimum value is : $minIntegerValue ")   //One int value is of 4 bytes and is 32 bit

    number = 2147483647
    println("")

     val myMaxByteValue: Byte = Byte.MAX_VALUE
     val myMinByteVlue : Byte = Byte.MIN_VALUE          //One Byte value is of 1 Byte  and is 8 bit
    println("Byte Maximum value is : $myMaxByteValue")
    println("Byte Minimum value is : $myMinByteVlue")

    val myMaxShortValue = Short.MAX_VALUE
    val myMinShortValue = Short.MIN_VALUE
    println("Short Maximum value is : $myMaxShortValue") //One short value is of 2 Byte
    println("Short Minimum value is : $myMinShortValue")

    val myMaxLongValue = Long.MAX_VALUE
    val myMinLongValue = Long.MIN_VALUE
    println("Long maximum value is:$myMaxLongValue")
    println("Long maximum value is:$myMinLongValue")

    val num = 64565465456464620L //Second way to declare long value
}