fun findTheDifference(s: String, t: String): Char {
    var res = 0
    for (c in s) res = res xor c.code
    for (c in t) res = res xor c.code

    return res.toChar()
}
