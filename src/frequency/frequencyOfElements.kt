package frequency

fun main() {
    val numList = listOf(4, 2, 4, 5, 2, 3, 4)
    var repeatTime: Int
    val alreadyPrinted = mutableListOf<Int>()

    for (i in 0..numList.lastIndex) {
        repeatTime = 0
        if(numList[i] !in alreadyPrinted) {
            for (j in 0..numList.lastIndex) {
                if (numList[i] == numList[j]) {
                    ++repeatTime
                }
            }
            println("${numList[i]} -> $repeatTime times")
            alreadyPrinted.add(numList[i])
        }
    }
}