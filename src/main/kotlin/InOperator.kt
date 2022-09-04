fun main() {
    println(isLetter('ç'))
    println(isNotDigit('x'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z' || c == 'ç' || c == 'Ç'

fun isNotDigit(c: Char) = c !in '0'..'9'