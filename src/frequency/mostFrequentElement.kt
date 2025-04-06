package frequency

fun main() {
    val numList = listOf(4, 2, 2, 4, 5, 2, 2, 2, 3, 4)
    var maximumRep = 0
    var noMostRep = 0
    var repeatTime: Int
    val alreadyPrinted = mutableListOf<Int>()

    for (i in 0..numList.lastIndex) {
        repeatTime = 0
        if (numList[i] !in alreadyPrinted) {
            for (j in 0..numList.lastIndex) {
                if (numList[i] == numList[j]) {
                    repeatTime++
                }
            }
            if (repeatTime > maximumRep) {
                noMostRep = numList[i]
                maximumRep = repeatTime
            }
            alreadyPrinted.add(numList[i])
        }
    }
    println("Max no : $noMostRep -> $maximumRep")
}