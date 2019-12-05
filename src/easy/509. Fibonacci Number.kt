package easy

fun fib(N: Int): Int {
    return when (N) {
        0 -> 0
        1 -> 1
        else -> fib(N - 2) + fib(N - 1)
    }
}

/**
 * Runtime: 128 ms, faster than 40.45% of Kotlin online submissions for Fibonacci Number.
 * Memory Usage: 30.6 MB, less than 100.00% of Kotlin online submissions for Fibonacci Number.
 */