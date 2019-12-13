package easy

fun subtractProductAndSum(n: Int): Int {
    var product = 1
    var sum = 0
    n.toString().map(Character::getNumericValue).forEach {
        product *= it
        sum += it
    }

    return product - sum
}

/**
 * Runtime: 132 ms, faster than 57.89% of Kotlin online submissions for Subtract the Product and Sum of Digits of an Integer.
 * Memory Usage: 30.8 MB, less than 100.00% of Kotlin online submissions for Subtract the Product and Sum of Digits of an Integer.
 */