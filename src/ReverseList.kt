fun main() {
    val revObj = ListStuff(mutableListOf(4, 3, 2, 7, 8, 2, 3, 1))
    var temp: Int
    var left = 0
    var right = revObj.noList.size - 1

    while (left < right) {
        temp = revObj.noList[left]
        revObj.noList[left] = revObj.noList[right]
        revObj.noList[right] = temp

        left++
        right--
    }
    println(revObj.noList)
}
