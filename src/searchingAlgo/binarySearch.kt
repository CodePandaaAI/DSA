package searchingAlgo

fun main() {
    val noList = listOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30)
    var start = 0
    val target = 24
    var end = noList.lastIndex
    var found = false

    while (start <= end) {
        val mid = (start + end) / 2
        if (noList[mid] == target) {
            println("Found the target($target) at index $mid")
            found = true
            break
        } else if (noList[mid] < target) {
            start = mid + 1
        } else {
            end = mid - 1
        }
    }
    if(!found) {
        println("Target $target not found in the list")
    }
}
