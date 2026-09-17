/**
 * Week 3 — 03 String manipulation without heavy stdlib shortcuts
 */
fun main() {
    println(rm("kotlin"))      // niltok
    println(isPal("level"))        // true
    println(cChar("hello", 'l'))      // 2
    println(removeSpaces("a b c"))        // abc
}

fun reverseManual(s: String): String {
    val chars = CharArray(s.length)
    var write = s.length - 1
    for (ch in s) {
        chars[write] = ch
        write--
    }
    return String(chars)
}

fun isPalindrome(s: String): Boolean {
    var left = 0
    var right = s.length - 1
    while (left < right) {
        if (s[left] != s[right]) return false
        left++
        right--
    }
    return true
}

fun countChar(s: String, target: Char): Int {
    var count = 0
    for (ch in s) {
        if (ch == target) count++
    }
    return count
}

fun removeSpaces(s: String): String {
    val out = StringBuilder()
    for (ch in s) {
        if (ch != ' ') out.append(ch)
    }
    return out.toString()
}


fun rm(s: String) : String {
    val chars = CharArray(s.length)
    var write = s.length - 1
    for(ch in s) {
        chars[write] = ch
        write--
    }
return String(chars)
}

fun isPal(s: String) : Boolean {
    var right = s.length -1
    var left = 0
    while(left < right) {
        if(s[left] != s[right]) return false
        left ++
        right --
    }
    return true
}

fun cChar(s: String, target: Char): Int {
    var count = 0
    for(ch in s) {
        if(ch == target) count++
    }
    return count
}