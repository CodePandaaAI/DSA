package numbersList

fun main() {
    val noList = mutableListOf(4, 3, 2, 7, 8, 2, 3, 1)
    val filteredList = mutableListOf<Int>()
    for (i in 0..<noList.size) {
        for (j in 0..<noList.size - 1) {
            if (noList[j] > noList[j + 1]) {
                noList[j] = noList[j + 1].also { noList[j + 1] = noList[j] }
            }
        }
    }
    for (j in 0..<noList.size - 1) {
        if (noList[j] == noList[j + 1]) {
            filteredList.add(noList[j])
        }
    }
    println(noList)
    println(filteredList)
}