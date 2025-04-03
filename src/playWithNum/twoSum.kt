package playWithNum
// Finding two numbers in a list that sum up to a target value.

fun main() {
    val target = 10
    val noList = listOf(5, 2, 4, 6, 8, 10, 4, 6)

    for (i in 0..noList.lastIndex) {
        for (j in i + 1..noList.lastIndex) {
            if (noList[i] + noList[j] == target) {
                println("The two numbers are at index : $i and index $j")
            }
        }
    }
}