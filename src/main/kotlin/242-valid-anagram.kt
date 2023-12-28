/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 * */
fun isAnagram(s: String, t: String): Boolean {
    // Verifica se o comprimento das strings é o mesmo
    if (s.length != t.length) {
        return false
    }

    // Cria um mapa para contar a frequência de cada caractere em s
    val charFrequency = mutableMapOf<Char, Int>()

    // Incrementa a contagem para cada caractere em s
    for (char in s) {
        charFrequency[char] = charFrequency.getOrDefault(char, 0) + 1
    }

    // Decrementa a contagem para cada caractere em t
    for (char in t) {
        val count = charFrequency.getOrDefault(char, 0)
        // Se o caractere não estiver em s ou sua contagem se tornar negativa, retorna falso
        if (count == 0) {
            return false
        }
        charFrequency[char] = count - 1
    }

    // Verifica se todas as contagens são zero, o que significa que as strings são anagramas
    return charFrequency.all { it.value == 0 }
}
