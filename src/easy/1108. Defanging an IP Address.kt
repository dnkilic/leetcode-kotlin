package easy

fun defangIPaddr(address: String) =
    address.map {
        if (it == '.') {
            "[.]"
        } else {
            it
        }
    }.joinToString(separator = "")


/**
 * Runtime: 160 ms, faster than 64.71% of Kotlin online submissions for Defanging an IP Address.
 * Memory Usage: 33.3 MB, less than 100.00% of Kotlin online submissions for Defanging an IP Address.
 */