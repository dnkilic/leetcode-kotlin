package easy

fun findJudge(N: Int, trust: Array<IntArray>): Int {
    if (N == 1) {
        return 1
    }

    val trusting = trust.map(IntArray::first)
    val everyoneTrusts = trust.map(IntArray::last).groupBy { it }.filter { it.value.size == N - 1 && !trusting.contains(it.key) }

    return if (everyoneTrusts.isNullOrEmpty()) {
        -1
    } else {
        everyoneTrusts.keys.first()
    }
}

/**
    Runtime: 460 ms, faster than 26.67% of Kotlin online submissions for Find the Town Judge.
    Memory Usage: 59.3 MB, less than 100.00% of Kotlin online submissions for Find the Town Judge.
 */