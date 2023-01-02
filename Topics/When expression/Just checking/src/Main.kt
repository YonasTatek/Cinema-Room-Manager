fun main() {
    // write your code here
    val choice = readln().toInt()
    println(when(choice){
        2 -> "Yes!"
        1 -> "No!"
        3 -> "No!"
        4 -> "No!"
        else -> "Unknown number"
    })
}