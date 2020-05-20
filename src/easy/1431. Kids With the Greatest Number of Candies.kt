package easy

fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {

    val max = candies.max()!!

    return candies.map {
        return@map it + extraCandies >= max
    }.toBooleanArray()
}

/**
 * Runtime: 288 ms, faster than 11.04% of Kotlin online submissions for Kids With the Greatest Number of Candies.
 * Memory Usage: 35 MB, less than 100.00% of Kotlin online submissions for Kids With the Greatest Number of Candies.*/