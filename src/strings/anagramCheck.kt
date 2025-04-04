package strings

fun main() {
    val str1 = "gum".toCharArray()
    val str2 = "mug".toCharArray()
    val sor1 = str1.sortedArray()
    val sor2 = str2.sortedArray()

    if (sor1.contentEquals(sor2)) {
        println("Its Anagram")
    } else println("Its not anagram")

}