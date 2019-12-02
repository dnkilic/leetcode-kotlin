package easy

class RecentCounter {

    private val queue = mutableListOf<Int>()

    fun ping(t: Int): Int {
        queue.add(0, t)
        for (i in queue.indices) {
            if (t > 3000 && queue[i] !in (t - 3000)..t) {
                return i
            }
        }

        return queue.size
    }
}

/**
 * Runtime: 640 ms, faster than 36.84% of Kotlin online submissions for Number of Recent Calls.
 * Memory Usage: 64.9 MB, less than 100.00% of Kotlin online submissions for Number of Recent Calls.
 */
