package day1

fun extractDigits(input: String): List<Int> {
    var workingSting = input
    val digits = mutableListOf<Int>()
    val digitsAsText = mapOf<String, Int>(
        "zero" to 0, "one" to 1, "two" to 2, "three" to 3, "four" to 4,
        "five" to 5, "six" to 6, "seven" to 7, "eight" to 8, "nine" to 9
    )
    while (workingSting.length > 0) {
        if (workingSting[0].isDigit()) {
            digits += workingSting[0].digitToInt()
        } else {
            for (textDigit in digitsAsText.keys) {
                if (workingSting.startsWith(textDigit, ignoreCase = true)) {
                    digits.add(digitsAsText[textDigit]!!)
                    break
                }
            }
        }
        workingSting = workingSting.substring(1)
    }
    return digits
}

fun getCalibrationValue(input: String): Int {
    val digits = extractDigits(input)
    return (digits.first.toString() + digits.last.toString()).toInt()
}

fun getCalibrationValueSum(lines: List<String>): Int {
    var sum = 0
    lines.forEach { sum += getCalibrationValue(it) }
    return sum
}