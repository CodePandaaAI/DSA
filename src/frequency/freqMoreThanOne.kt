package frequency

fun main() {
    val list = listOf(1, 2, 3, 2, 4, 5, 1, 6, 2)
    var repeatedTime: Int

    val alreadyExecuted = mutableListOf<Int>()

    for (i in 0..list.lastIndex) {
        repeatedTime = 0
        if (list[i] !in alreadyExecuted) {
            for (j in 0..list.lastIndex) {
                if (list[i] == list[j]) {
                    repeatedTime++
                }
            }
            if (repeatedTime > 1) {
                println("${list[i]} -> $repeatedTime times")
            }
            alreadyExecuted.add(list[i])
        }
    }
}