package easy

fun sortArrayByParity(A: IntArray): IntArray {
    val result = mutableListOf<Int>()
    A.forEach {
        when {
            it % 2 == 0 -> result.add(0, it)
            else -> result.add(it)
        }
    }

    return result.toIntArray()
}

/**
 * Runtime: 232 ms, faster than 60.56% of Kotlin online submissions for Sort Array By Parity.
 * Memory Usage: 39.3 MB, less than 100.00% of Kotlin online submissions for Sort Array By Parity.
 */