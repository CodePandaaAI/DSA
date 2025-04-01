package listString

fun main() {
    val sentence = "I love Kotlin".split(" ")
    var str: CharArray
    var tempChar: Char

    for (i in 0..sentence.lastIndex) {
        str = sentence[i].toCharArray()
        var left = 0
        var right = str.lastIndex
        while (left < right) {
            tempChar = str[left]
            str[left] = str[right]
            str[right] = tempChar
            left++
            right--
        }
        print(String(str) + " ")
    }
}