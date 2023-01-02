package cinema
fun Arthmetic(a:Int,b:Int,op:String):Int{
    val result:Int =
        when(op){
        "+", "plus" -> a+b
        "-", "minus" -> a-b
        "*", "times" -> a*b
            else -> -1
    }
    return  result
}
fun main() {
    // write your code here

    while(true){
        val (a,b,op) = readln().split(' ')

        println(Arthmetic(a.toInt(),b.toInt(),op))
    }
}