package playWithNum

// You are given a list containing numbers from 0 to n, but one number is missing. Find the missing number efficiently.

/*
    val numbers = listOf(0, 1, 2, 4, 5)
    Output: 3 (because 3 is missing)

*/

fun main() {
    val numbers = listOf(0, 1, 2, 4, 5)
    for (i in 0..<numbers.lastIndex) {
        if (numbers[i] + 1 == numbers[i + 1]) {
            continue
        } else println(i + 1)
    }
}