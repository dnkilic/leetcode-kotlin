package easy

fun arrayPairSum(nums: IntArray): Int {
    val sorted = nums.sortedArray()
    var count = 0
    for (i in sorted.indices step 2) {
        count += sorted[i]
    }
    return count
}

/**
    Runtime: 344 ms, faster than 12.00% of Kotlin online submissions for Array Partition I.
    Memory Usage: 39.9 MB, less than 100.00% of Kotlin online submissions for Array Partition I.
 */