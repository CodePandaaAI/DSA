package searchingAlgo

fun exponentialSearch(list: List<Int>, target: Int): Int {
    val n = list.size

    //  Check if the first element is the target
    if (list[0] == target) return 0

    //  Exponential phase: Find range for binary search
    var index = 1
    while (index < n && list[index] < target) {
        println("Jumping to index $index -> ${list[index]}")
        index *= 2
    }

    //  Define range boundaries for binary search
    val left = index / 2
    val right = minOf(index, n - 1)
    println("Now doing binary search from $left to $right")

    //  Binary Search phase
    var start = left
    var end = right
    while (start <= end) {
        val mid = (start + end) / 2
        println("Checking mid $mid -> ${list[mid]}")
        when {
            list[mid] == target -> return mid
            list[mid] < target -> start = mid + 1
            else -> end = mid - 1
        }
    }

    //  If not found
    return -1
}

fun main() {
    val list = listOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21)
    val target = 15
    val result = exponentialSearch(list, target)

    if (result != -1)
        println("✅ Target $target found at index $result")
    else
        println("❌ Target $target not found in the list")
}
