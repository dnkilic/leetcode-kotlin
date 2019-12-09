package easy

fun twoCitySchedCost(costs: Array<IntArray>): Int {
    val cityA = mutableListOf<IntArray>()
    val cityB = mutableListOf<IntArray>()
    for (candidate in costs) {
        if (candidate.first() < candidate.last()) {
            cityA.add(intArrayOf(candidate.first(), candidate.last() - candidate.first()))
        } else {
            cityB.add(intArrayOf(candidate.last(), candidate.first() - candidate.last()))
        }
    }

    return when {
        cityA.size == cityB.size -> {
            val total = cityA.map(IntArray::first).sum() + cityB.map(IntArray::first).sum()
            total
        }
        cityA.size > cityB.size -> {
            var total = cityA.map(IntArray::first).sum() + cityB.map(IntArray::first).sum()
            total += cityA.map { it.last() }.sorted().take(cityA.size - costs.size / 2).sum()
            total
        }
        else -> {
            var total = cityA.map(IntArray::first).sum() + cityB.map(IntArray::first).sum()
            total += cityB.map { it.last() }.sorted().take(cityB.size - costs.size / 2).sum()
            total
        }
    }
}

/**
 * Runtime: 196 ms, faster than 12.50% of Kotlin online submissions for Two City Scheduling.
 * Memory Usage: 39.5 MB, less than 100.00% of Kotlin online submissions for Two City Scheduling.
 */