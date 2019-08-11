package easy

fun removeOuterParentheses(S: String): String {
    val stack = mutableListOf<Char>()
    var result = ""
    S.forEach {
        when (it) {
            '(' -> {
                if (stack.size != 0) {
                    result += '('
                }

                stack.add('(')
            }
            ')' -> {
                stack.remove(stack.last())

                if (stack.size != 0) {
                    result += ')'
                }
            }
        }
    }

    return result
}

/**
 * Runtime: 208 ms, faster than 36.76% of Kotlin online submissions for Remove Outermost Parentheses.
 * Memory Usage: 36 MB, less than 100.00% of Kotlin online submissions for Remove Outermost Parentheses.
 */
