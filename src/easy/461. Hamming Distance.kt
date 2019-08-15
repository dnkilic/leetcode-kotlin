package easy

import java.lang.StringBuilder
import kotlin.math.absoluteValue

fun hammingDistance(x: Int, y: Int): Int {
    var firstNumber = x.toString(radix = 2)
    val firstSize = firstNumber.length
    var secondNumber = y.toString(radix = 2)
    val secondSize = secondNumber.length
    val digitDifference = firstSize - secondSize
    if (digitDifference >= 0) {
        secondNumber = StringBuilder("0".repeat(digitDifference)).append(secondNumber).toString()
    } else {
        firstNumber = StringBuilder("0".repeat(digitDifference.absoluteValue)).append(firstNumber).toString()
    }

    return secondNumber.filterIndexed { index, char ->
        firstNumber[index] != char
    }.count()
}

/**
 * Runtime: 156 ms, faster than 16.07% of Kotlin online submissions for Hamming Distance.
 * Memory Usage: 32.7 MB, less than 100.00% of Kotlin online submissions for Hamming Distance.
 */