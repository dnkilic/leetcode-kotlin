package easy

fun addBinary(a: String, b: String): String {
    return (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)
}

/**
 * Runtime: 152 ms, faster than 95.51% of Kotlin online submissions for Add Binary.
 * Memory Usage: 33 MB, less than 100.00% of Kotlin online submissions for Add Binary.
 */