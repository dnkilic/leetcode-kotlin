package easy

fun balancedStringSplit(s: String): Int {
    var count = 0
    var stack = 0
    s.forEach {
        when (it) {
            'L' -> { stack++ }
            'R' -> { stack-- }
        }

        if (stack == 0) {
            count++
        }
    }

    return count
}

/**
    Runtime: 128 ms, faster than 87.40% of Kotlin online submissions for Split a String in Balanced Strings.
    Memory Usage: 31.5 MB, less than 100.00% of Kotlin online submissions for Split a String in Balanced Strings.
 */