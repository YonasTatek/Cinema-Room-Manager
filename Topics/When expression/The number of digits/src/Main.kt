fun main() {
    // put your code here
    val number1 = readln()
    println(when(number1.length){
        1 -> '1'
        2 -> '2'
        3 -> '3'
        4 -> '4'
        else -> number1.length
    })
}
