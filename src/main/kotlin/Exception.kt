import java.lang.IllegalArgumentException

fun main() {
    var  porcentagem = porcentagem(59)
    println(porcentagem)

    porcentagem = porcentagem(110)
    println(porcentagem)
}

fun porcentagem(numero: Int): String{
    return if (numero in 1..100){
        "$numero%"
    } else {
        throw IllegalArgumentException("$numero deve estar entre 1 e 100")
    }
}

