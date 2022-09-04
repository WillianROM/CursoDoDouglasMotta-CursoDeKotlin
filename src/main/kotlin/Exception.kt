import java.io.BufferedReader
import java.lang.IllegalArgumentException
import java.io.FileReader
import java.io.File
import java.lang.Exception
import java.lang.NumberFormatException

fun main() {

    val idade = lerIdade()
    println(idade)

    try {

        var porcentagem = porcentagem(59)
        println(porcentagem)

        porcentagem = porcentagem(110)
        println(porcentagem)

    }catch (e: IllegalArgumentException){
        println(e.message)
    }
}

fun porcentagem(numero: Int): String{
    return if (numero in 1..100){
        "$numero%"
    } else {
        throw IllegalArgumentException("$numero não é válido, o número deve estar entre 1 e 100")
    }
}

fun lerIdade(): Int? { //Int? - a função pode retornar um número inteiro ou valor nulo, por isso do sinal '?' no final
    val reader = FileReader(File("src/main/kotlin/idades.txt"))
    val buffer = BufferedReader(reader)

    try {
        val numero = buffer.readLine()
        return Integer.parseInt(numero)
    } catch(e: NumberFormatException){ //NumberFormatException é a exceção para formato de número
        return null
    } finally{
        buffer.close()
    }
}

