package easy

fun repeatedNTimes(A: IntArray): Int {
    val elements = mutableListOf<Int>()
    var result: Int? = null
    for (i in A.indices) {
        if (elements.contains(A[i])) {
            result = A[i]
            break
        }

        elements.add(A[i])
    }

    return result!!
}

/**
 * Runtime: 228 ms, faster than 83.87% of Kotlin online submissions for N-Repeated Element in Size 2N Array.
 * Memory Usage: 36.7 MB, less than 100.00% of Kotlin online submissions for N-Repeated Element in Size 2N Array.
 */