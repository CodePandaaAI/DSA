//fun main() {
//    val a = listOf<Int>(1,2,3,4,5,6)
//    println(findMax(a) ?: "Poppat Ho gya apka")
//}
//
//fun findMax(noList: List<Int>): Int? {
//    return noList.minOrNull()
//}

fun main() {
    var minNo = Int.MAX_VALUE
    val noList = listOf<Int>(1, 2, 4, 6, 9, 4, 66, 334, 6, 7, 0, 88, 6, 6, 5)
    if (noList.isEmpty()) {
        println("Not applicable on empty list!")
    } else {
        for (num in noList) {
            if (num < minNo)
                minNo = num
        }
        println(minNo)
    }
}