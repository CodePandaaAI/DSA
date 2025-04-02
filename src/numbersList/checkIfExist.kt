package numbersList

fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)
    val target = 30
    var isThere = false
    var index: Int = 0
    for (i in numbers.indices) {
        if (numbers[i] == target) {
            isThere = true
            index = i
            break
        }
    }
    if (isThere) {
        println("The target number exists at index[$index]")
    } else println("No the target number doesn't exists")
}