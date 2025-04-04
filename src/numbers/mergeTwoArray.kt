package numbers

fun main() {
    val list1 = listOf(1, 3, 5, 7)
    val list2 = listOf(2, 4, 6, 8)
    val mergedList = mutableListOf<Int>()
    mergedList += list1 + list2
    var temp: Int
    // [1, 2, 3, 4, 5, 6, 7, 8]
    for (i in 0..<mergedList.size) {
        for (j in 0..mergedList.size - 2) {
            temp = mergedList[j]
            if (mergedList[j] > mergedList[j + 1]) {
                mergedList[j] = mergedList[j + 1]
                mergedList[j + 1] = temp
            }
        }
    }

    println(mergedList)
}