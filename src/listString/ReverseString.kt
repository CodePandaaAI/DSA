package listString

fun main() {
    val stringRev = "hello".toCharArray()
    var tempC: Char
    var left = 0
    var right = stringRev.size -1
    while (left<right){
        tempC = stringRev[left]
        stringRev[left] = stringRev[right]
        stringRev[right] = tempC

        left++
        right--
    }
    println(String(stringRev))
}

