package numbers

fun main() {
    val noList = mutableListOf(8, 7, 4, 3, 1, 2)
    for (i in 0..<noList.size) {
        for (j in 0..noList.size - 2) {
            if (noList[j] > noList[j + 1]) {
                val temp = noList[j]
                noList[j] = noList[j + 1]
                noList[j + 1] = temp
            }
        }
    }
    println("Sorted List: ${noList.firstOrNull()}")
}