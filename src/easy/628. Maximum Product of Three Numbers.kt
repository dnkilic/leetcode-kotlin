package easy

fun maximumProduct(nums: IntArray): Int {
    nums.sort()
    var positive = 1
    nums.takeLast(3).forEach { positive *= it }
    var negative = 1
    (nums.take(2) + nums.takeLast(1)).forEach { negative *= it }

    return if (positive > negative) {
        positive
    } else {
        negative
    }
}

/**
 * Runtime: 312 ms, faster than 16.67% of Kotlin online submissions for Maximum Product of Three Numbers.
 * Memory Usage: 39.5 MB, less than 100.00% of Kotlin online submissions for Maximum Product of Three Numbers.
 */