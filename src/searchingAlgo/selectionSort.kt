package searchingAlgo

fun main() {
    val list = mutableListOf(64, 25, 12, 22, 11)

    for(i in 0..list.lastIndex){
        var minIndex = i

        for(j in i+1..list.lastIndex){
            if(list[j] < list[minIndex]){
                minIndex = j
            }
        }

        val temp = list[i]
        list[i] = list[minIndex]
        list[minIndex] = temp
    }
    println(list)
}