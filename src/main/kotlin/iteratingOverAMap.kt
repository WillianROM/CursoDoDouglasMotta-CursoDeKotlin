import java.util.*
// Imprimir as representações binários dos caracteres de A a F

fun main() {//psvm
    val binaryRepresentation = TreeMap<Char, String>()

    for (c in 'A'..'Z'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryRepresentation[c] = binary
    }

    for ((letter, binary) in binaryRepresentation){
        println("$letter - $binary")
    }
}