package strings

fun main() {
    val sentence = "I love kotlin".split(" ")
    for (i in sentence.lastIndex downTo 0) {
        print(sentence[i] + " ")
    }
}