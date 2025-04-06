package frequency

fun main() {
    val list1 = listOf(1, 2, 2, 3, 3).sorted()
    val list2 = listOf(2, 3, 2, 1, 3).sorted()

    var haveSameElements = true
    var haveSameFrequency = true

    if (list1.size != list2.size) {
        println("False")
        return
    }

    // Check if same elements exist at same position after sorting
    for (i in 0..list1.lastIndex) {
        if (list1[i] != list2[i]) {
            haveSameElements = false
            break
        }
    }

    val checked = mutableListOf<Int>()

    for (i in 0..list1.lastIndex) {
        val current = list1[i]
        var freq1 = 0
        var freq2 = 0

        if (current !in checked) {
            for (j in 0..list1.lastIndex) {
                if (list1[j] == current) freq1++
                if (list2[j] == current) freq2++
            }

            if (freq1 != freq2) {
                haveSameFrequency = false
                break
            }
            checked.add(current)
        }
    }

    val result = haveSameElements && haveSameFrequency
    println(result)
}

