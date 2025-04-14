package jumpSearchPractice

import kotlin.math.sqrt

// listOf(1, 3, 5, 7, 9, 11, 13, 15)
fun jumpSearch(list: List<Int>, target: Int): Int {
    val n = list.size
    val step = sqrt(n.toDouble()).toInt()
    var prevIndex = 0
    var currentIndex = step

    if (target > list[n - 1])
        return -2
    if (list[list.lastIndex] == target) {
        return list.lastIndex
    }

    while (list[currentIndex] < n && list[currentIndex] < target) {
        println("Value at index $prevIndex -> ${list[prevIndex]}")
        prevIndex = currentIndex
        currentIndex += step
    }
    if (list[currentIndex] == target) {
        return currentIndex
    }
    if (list[currentIndex] > target) {
        for (i in prevIndex..<currentIndex) {
            if (list[i] == target) {
                return i
            }
        }
    }
    return -1

}

fun main() {
    val list = listOf(1, 3, 5, 7, 9, 11, 13, 15)
    val target = 16
    when (val result = jumpSearch(list, target)) {
        -1 -> {
            println("target $target not found")
        }

        -2 -> {
            println("Target $target doesn't exist in the list")
        }

        else -> {
            println("Target $target Found at index $result ")
        }
    }
}