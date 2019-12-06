package easy

fun removeDuplicates(S: String): String {
    val stash = mutableListOf<Char>()
    S.forEach {
        if (stash.size == 0 || (stash.size >= 1 && stash[0] != it)) {
            stash.add(0, it)
        } else {
            stash.removeAt(0)
        }
    }

    return stash.joinToString(separator = "").reversed()
}

/**
 * Runtime: 508 ms, faster than 16.67% of Kotlin online submissions for Remove All Adjacent Duplicates In String.
 * Memory Usage: 37 MB, less than 100.00% of Kotlin online submissions for Remove All Adjacent Duplicates In String.
 */