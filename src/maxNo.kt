//fun main() {
//    val a = listOf<Int>(1,2,3,4,5,6)
//    println(findMax(a) ?: "Poppat Ho gya apka")
//}
//
//fun findMax(noList: List<Int>): Int? {
//    return noList.maxOrNull()
//}

fun main() {
    var maxNumber = Int.MIN_VALUE
    val numbers = listOf<Int>(-3444, 1, 3, 5, 8, 4, 2, 2323, 565, 8977856, 4322, 1, 56, 8, 9)
    if (numbers.isEmpty()) {
        println("This operation cant be performed on empty list!")
    } else {
        for (i in 0..numbers.lastIndex) {
            if (numbers[i] >= maxNumber) {
                maxNumber = numbers[i]
            }
        }
        println(maxNumber)
    }
}