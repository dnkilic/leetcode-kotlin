package easy

fun flipAndInvertImage(A: Array<IntArray>): Array<IntArray> {
    return A.map { array ->
        array.map {
            when (it) {
                0 -> 1
                else -> 0
            }
        }.asReversed().toIntArray()
    }.toTypedArray()
}

/**
 * Runtime: 224 ms, faster than 27.17% of Kotlin online submissions for Flipping an Image.
 * Memory Usage: 40.8 MB, less than 100.00% of Kotlin online submissions for Flipping an Image.
 */