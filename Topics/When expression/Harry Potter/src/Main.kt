fun main() {
    // write your code here
    val house = readln()
    println(when(house){
        "gryffindor" -> "bravery"
        "hufflepuff" -> "loyalty"
        "ravenclaw" -> "intellect"
        "slytherin" -> "cunning"
        else -> "not a valid house"
    })

}
