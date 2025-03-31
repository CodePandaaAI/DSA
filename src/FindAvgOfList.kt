data class ListStuff(
    val noList: MutableList<Int>
)

fun main() {
    var sumOfElements: Int = 0
    val listObj = ListStuff(noList = mutableListOf(4, 3, 2, 7, 8, 2, 3, 1))
    for (i in 0..<listObj.noList.size) {
        sumOfElements += listObj.noList[i]
    }
    println(sumOfElements.toFloat() / listObj.noList.size)
}