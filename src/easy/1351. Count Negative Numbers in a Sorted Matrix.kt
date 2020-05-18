package easy

fun countNegatives(grid: Array<IntArray>): Int {

    var negativeCount = 0
    for (m in grid.indices) {
        val arr = grid[m]
        for (n in arr.indices) {
            if (grid[m][n] > 0) {
                continue
            } else {
                negativeCount += arr.size - n
                break
            }
        }
    }

    return negativeCount
}

/**
 * Runtime: 192 ms, faster than 89.55% of Kotlin online submissions for Count Negative Numbers in a Sorted Matrix.
 * Memory Usage: 41.3 MB, less than 100.00% of Kotlin online submissions for Count Negative Numbers in a Sorted Matrix.*/