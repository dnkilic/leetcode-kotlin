package easy

fun destCity(paths: List<List<String>>): String {

    val departure = paths.map { it.first() }
    val arrival = paths.map { it.last() }

    arrival.forEach {
        if (departure.contains(it)) {
            return it
        }
    }

    return ""
}

/**
 * Runtime: 200 ms, faster than 66.20% of Kotlin online submissions for Destination City.
 * Memory Usage: 34.3 MB, less than 100.00% of Kotlin online submissions for Destination City.
 */