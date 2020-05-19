package easy

fun isPalindrome(x: Int): Boolean {
    val str = x.toString()
    val size = str.length

    if (x < 0) {
        return false
    }

    if (size % 2 == 0) {
        val a = str.slice(0 until size / 2)
        val b = str.slice(size / 2 until str.length)
        if (a == b.reversed()) {
            return true
        }
    } else {
        val a = str.slice(0 until size / 2)
        val b = str.slice(size / 2 + 1 until str.length)
        if (a == b.reversed()) {
            return true
        }
    }

    return false
}

/**
 * Runtime: 472 ms, faster than 5.11% of Kotlin online submissions for Palindrome Number.
 * Memory Usage: 42.3 MB, less than 11.11% of Kotlin online submissions for Palindrome Number.
 */