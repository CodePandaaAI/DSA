package searchingAlgo

fun ternarySearch(list: List<Int>, target: Int): Int {
    var low = 0
    var high = list.lastIndex

    // listOf(2, 4, 6, 8, 10, 12, 14, 16, 18)
    while (low <= high) {
        val mid1 = low + (high - low) / 3
        val mid2 = high - (high - low) / 3
        println("Checking range: [$low, $high]")
        println("Mid1 index: $mid1 → Value: ${list[mid1]}")
        println("Mid2 index: $mid2 → Value: ${list[mid2]}")

        if (list[mid1] == target) {
            println("🎯 Found target at Mid1 ($mid1)")
            return mid1
        }
        if (list[mid2] == target) {
            println("🎯 Found target at Mid2 ($mid2)")
            return mid2
        }

        if (target < list[mid1]) {
            println("🡺 Target is in left segment")
            high = mid1 - 1
        } else if (target > list[mid2]) {
            println("🡸 Target is in right segment")
            low = mid2 + 1
        } else {
            println("↔️ Target is in middle segment")
            low = mid1 + 1
            high = mid2 - 1
        }

        println("-----------")
    }

    println("❌ Target not found")
    return -1
}

fun main() {
    val list = listOf(2, 4, 6, 8, 10, 12, 14, 16, 18)
    val target = 10

    val result = ternarySearch(list, target)
    if (result != -1) {
        println("✅ Target $target found at index $result")
    } else {
        println("❌ Target $target not found in the list")
    }
}
