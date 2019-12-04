package easy

fun missingNumber(nums: IntArray): Int {
    val arr = arrayOfNulls<Boolean?>(nums.size)
    nums.forEach { arr[it] = true }
    return arr.indexOf(null)
}

/**
 * Runtime: 216 ms, faster than 69.62% of Kotlin online submissions for Missing Number.
 * Memory Usage: 37.1 MB, less than 100.00% of Kotlin online submissions for Missing Number.
 */