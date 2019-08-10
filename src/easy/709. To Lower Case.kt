package easy

// Runtime: 132 ms
// Memory Usage: 31.3 MB
fun toLowerCase1(str: String) =
    str.toLowerCase()

// Runtime: 148 ms
// Memory Usage: 33.3 MB
fun toLowerCase2(str: String) =
    str.map {
        if (it.isUpperCase()) {
            it.toLowerCase()
        } else {
            it
        }
    }.joinToString(separator = "")

// Runtime: 152 ms
// Memory Usage: 33.4 MB
fun toLowerCase3(str: String): String {
    val distance = 'A' - 'a'
    return str.map {
        when (it) {
            in 'A'..'Z' -> it - distance
            else -> it
        }
    }.joinToString(separator = "")
}

// Runtime: 196 ms
// Memory Usage: 33.3 MB
fun toLowerCase4(str: String): String {
    val distance = 'A' - 'a'
    return str.map {
        if (it in 'A'..'Z') {
            it - distance
        } else {
            it
        }
    }.joinToString(separator = "")
}