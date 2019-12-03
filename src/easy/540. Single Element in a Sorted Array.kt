package easy

fun singleNonDuplicate(nums: IntArray): Int {
    return nums.groupBy { it }.entries.first { it.value.size == 1 }.key
}

/**
 * Runtime: 208 ms, faster than 41.67% of Kotlin online submissions for Single Element in a Sorted Array.
 * Memory Usage: 38.9 MB, less than 100.00% of Kotlin online submissions for Single Element in a Sorted Array.
 */
