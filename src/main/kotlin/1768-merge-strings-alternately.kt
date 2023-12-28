/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 *
 * Example 1:
 *
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 * Example 2:
 *
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1:  a   b
 * word2:    p   q   r   s
 * merged: a p b q   r   s
 *
 * */

fun mergeAlternately(word1: String, word2: String): String {
    val builder = StringBuilder()
    builder.append(word1.drop(2))

    //Get the smaller of two Int values
    val minSize = minOf (word1.length, word2.length)

    for(i in 0 until minSize) {
        builder.append(word1[i]).append(word2[i])
    }

    return if (word1.length == word2.length) {
        builder.toString()
    } else if (word1.length > word2.length) {
        // Returns a substring of this string that starts at the specified startIndex and continues to the end of the string.
        // Ex: minSize = 3, word1 = abcdef
        // word1.substring(minSize) == ef
        builder.append(word1.substring(minSize)).toString()
    } else {
        builder.append(word2.substring(minSize)).toString()
    }
}
