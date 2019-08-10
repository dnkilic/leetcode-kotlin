package easy

val morseAlphabet = arrayOf(".-", "-...", "-.-.", "-..",
    ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
    "--","-.","---", ".--.", "--.-", ".-.", "...", "-",
    "..-", "...-", ".--", "-..-", "-.--", "--..")

fun uniqueMorseRepresentations(words: Array<String>): Int {
    return words.map {
        val result = StringBuffer()
        it.forEach { char ->
            result.append(morseAlphabet[char - 'a'])
        }
        return@map result.toString()
    }.toSet().count()

}

/**
 * Runtime: 172 ms, faster than 59.18% of Kotlin online submissions for Unique Morse Code Words.
 * Memory Usage: 33.3 MB, less than 100.00% of Kotlin online submissions for Unique Morse Code Words.
 */