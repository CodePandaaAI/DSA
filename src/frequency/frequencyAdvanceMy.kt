package frequency

fun main() {
    val list1 = listOf(1, 2, 2, 3, 3).sorted()
    val list2 = listOf(2, 3, 2, 1, 3).sorted()
    var repeatedTimeList1: Int
    var repeatedTimeList2: Int
    var containsSameElements = false
    var haveSameFrequency = false
    if (list1.size == list2.size) {
        for (i in 0..list1.lastIndex) {
            if (list1[i] == list2[i]) {
                containsSameElements = true
            }
        }
        for (i in 0..list1.lastIndex) {
            repeatedTimeList1 = 0
            repeatedTimeList2 = 0
            for (j in 0..list1.lastIndex) {
                if(list1[i] == list1[j] && list2[i] == list2[j]){
                    repeatedTimeList1++
                    repeatedTimeList2++
                }
                if (repeatedTimeList1 == repeatedTimeList2) {
                    haveSameFrequency = true
                }
            }
        }
    }
    val result = if (containsSameElements && haveSameFrequency) {
        "True"
    } else "False"
    println(result)
}