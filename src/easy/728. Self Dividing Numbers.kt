package easy

fun selfDividingNumbers(left: Int, right: Int): List<Int> {
    val result = mutableListOf<Int>()
    for (number in left..right) {
        val strRepresentationOfNumber = number.toString()
        if (!strRepresentationOfNumber.contains('0')) {
            when {
                number % 11 == 0 -> result.add(number)
                number < 10 -> result.add(number)
                verifySelfDividing(strRepresentationOfNumber) -> result.add(number)
            }
        }
    }

    return result
}

fun verifySelfDividing(strRepresentationOfNumber: String): Boolean {
    val number = strRepresentationOfNumber.toInt()
    val digits = strRepresentationOfNumber.chunked(1)
    digits.forEach {
        if (number % it.toInt() != 0) {
            return false
        }
    }

    return true
}

/**
 * Runtime: 172 ms, faster than 48.78% of Kotlin online submissions for Self Dividing Numbers.
 * Memory Usage: 36.3 MB, less than 100.00% of Kotlin online submissions for Self Dividing Numbers.
 */
