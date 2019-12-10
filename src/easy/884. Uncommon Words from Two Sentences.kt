package easy

fun uncommonFromSentences(A: String, B: String): Array<String> {
    val mapA = A.split(" ").groupBy { it }
    val mapB = B.split(" ").groupBy { it }
    val intersect = mapA.keys.intersect(mapB.keys)
    return mapA.filterNot { intersect.contains(it.key) || it.value.size != 1 }.map { it.key }.toTypedArray() +
            mapB.filterNot { intersect.contains(it.key) || it.value.size != 1 }.map { it.key }.toTypedArray()
}

/**
 * Runtime: 172 ms, faster than 95.45% of Kotlin online submissions for Uncommon Words from Two Sentences.
 * Memory Usage: 36.9 MB, less than 100.00% of Kotlin online submissions for Uncommon Words from Two Sentences.
 * */