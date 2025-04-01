package numbersList

fun main() {
    println(sortIt(mutableListOf(4, 7, 2, 34, 7), 3))
}

fun sortIt(unSorted: MutableList<Int>, kthNo: Int): Int {
    var temp: Int
    for (i in 0..<unSorted.size) {
        for (j in 0..unSorted.size - 2) {
            if (unSorted[j] > unSorted[j + 1]) {
                temp = unSorted[j]
                unSorted[j] = unSorted[j + 1]
                unSorted[j + 1] = temp
            }
        }
    }
    return unSorted[kthNo]
}