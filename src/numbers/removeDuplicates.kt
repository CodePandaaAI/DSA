package numbers


//  Input:  [1, 1, 2, 2, 3, 4, 4, 4, 5]
//  Output: [1, 2, 3, 4, 5]

fun main() {
    val dupList = mutableListOf(1, 1, 2, 2, 3, 4, 4, 4, 5)
    val uniqueList = mutableListOf<Int>()
    for (i in 0..dupList.lastIndex) {
        if (i == dupList.lastIndex) {
            uniqueList.add(dupList[i])
            break
        }
        else if (dupList[i] == dupList[i + 1]) {
            uniqueList.add(dupList[i + 1])
        }
    }
    println(uniqueList)
}