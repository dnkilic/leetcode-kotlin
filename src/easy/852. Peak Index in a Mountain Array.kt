package easy

fun peakIndexInMountainArray(A: IntArray): Int {
    A.forEachIndexed { index, i ->
        if (index > 0 && index < A.size - 1) {
            if (A[index - 1] < i && A[index + 1] < i) {
                return index
            }
        }
    }

    return -1
}

/**
    Runtime: 188 ms, faster than 85.51% of Kotlin online submissions for Peak Index in a Mountain Array.
    Memory Usage: 36.3 MB, less than 100.00% of Kotlin online submissions for Peak Index in a Mountain Array.
 */