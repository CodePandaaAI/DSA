package searchingAlgo

import kotlin.math.sqrt
import kotlin.math.min

// 🧠 Function to perform Jump Search on a sorted list
fun jumpSearch(list: List<Int>, target: Int): Int {
    val n = list.size

    // Step 1️⃣: Calculate optimal jump size (√n)
    val step = sqrt(n.toDouble()).toInt()
    println("📏 Step size (√n) calculated: $step")

    var prev = 0        // Start of current jump block
    var curr = step     // End of current jump block (initially at step)

    println("🔍 Starting Jump Search for target: $target in list: $list\n")

    // Step 2️⃣: Jumping Phase
    while (curr < n && list[curr] < target) {
        println("🚀 Jumping: checking list[$curr] = ${list[curr]} which is < $target")
        prev = curr
        curr += step
    }

    // 🧠 Check if current jump point is equal to target
    if (curr < n && list[curr] == target) {
        println("✅ Found at jump point! list[$curr] == $target")
        return curr
    }

    println("\n🧱 Block suspected: [$prev, ${min(curr, n) - 1}]. Now doing Linear Search in this range...")

    // Step 3️⃣: Linear Search in suspected block
    for (i in prev..<min(curr, n)) {
        println("🔎 Checking index $i → list[$i] = ${list[i]}")
        if (list[i] == target) {
            println("✅ Found! list[$i] == $target")
            return i
        }
    }

    // If not found in block
    println("❌ Target $target not found in list.")
    return -1
}

fun main() {
    val list = listOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)
    val target = 5

    println("📦 Sorted List: $list")
    println("🎯 Searching for: $target\n")

    val result = jumpSearch(list, target)

    println("\n🔚 Final Result:")
    if (result != -1) {
        println("🎉 Target $target found at index $result ✅")
    } else {
        println("😓 Target $target not found ❌")
    }
}