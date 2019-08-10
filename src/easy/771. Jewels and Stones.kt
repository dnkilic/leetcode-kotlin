package easy

fun numJewelsInStones(J: String, S: String): Int {
    val jewelsMap = J.groupBy { it }
    val stonesMap = S.groupBy { it }
    var count = 0
    for ((key, value) in stonesMap) {
        if (jewelsMap.containsKey(key)) {
            count += value.size
        }
    }

    return count
}

/**
 * Runtime: 160 ms, faster than 51.80% of Kotlin online submissions for Jewels and Stones.
 * Memory Usage: 32.6 MB, less than 100.00% of Kotlin online submissions for Jewels and Stones.
 */
