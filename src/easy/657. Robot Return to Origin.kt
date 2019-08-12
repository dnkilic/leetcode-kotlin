package easy

fun judgeCircle(moves: String): Boolean {
    val movesMap = moves.groupBy { it }
    val xMoves = if (movesMap['L'] != null && movesMap['R'] != null) {
        movesMap['L']?.size == movesMap['R']?.size
    } else movesMap['L'] == null && movesMap['R'] == null

    val yMoves = if (movesMap['U'] != null && movesMap['D'] != null) {
        movesMap['U']?.size == movesMap['D']?.size
    } else movesMap['U'] == null && movesMap['D'] == null

    return xMoves && yMoves
}

/**
 * Runtime: 200 ms, faster than 50.56% of Kotlin online submissions for Robot Return to Origin.
 * Memory Usage: 38.1 MB, less than 100.00% of Kotlin online submissions for Robot Return to Origin.
 */