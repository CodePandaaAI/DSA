package leetcodeQuestions

fun main() {
    val roman = "XIV"
    val romanMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    var i = 0

    while (i < roman.length) {
        val currentChar = roman[i]
        val currentValue = romanMap[currentChar]!!
        println(currentValue)

        if (i + 1 < roman.length) {
            val nextChar = roman[i + 1]
            val nextValue = romanMap[nextChar]!!

            if (currentValue < nextValue) {
                // Subtract case
                println("Subtract: $currentChar($currentValue) < $nextChar($nextValue)")
                result += (nextValue - currentValue)
                i += 2
                continue
            }
        }

        println("Add: $currentChar($currentValue)")
        result += currentValue
        i += 1
    }

    println("Final result = $result")
}
