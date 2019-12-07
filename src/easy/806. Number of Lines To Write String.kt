package easy

private val alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray()

fun numberOfLines(widths: IntArray, S: String): IntArray {
    val lines = mutableListOf<Int>()
    var total = 0
    for (char in S) {
        val alphabetIndex = alphabet.indexOf(char)
        if (widths[alphabetIndex] <= 100 - total) {
            total += widths[alphabetIndex]
        } else {
            lines.add(total)
            total = widths[alphabetIndex]
        }
    }

    return intArrayOf(lines.size + 1, total)
}

/**
 * Runtime: 164 ms, faster than 20.00% of Kotlin online submissions for Number of Lines To Write String.
 * Memory Usage: 35.1 MB, less than 100.00% of Kotlin online submissions for Number of Lines To Write String.
 */
