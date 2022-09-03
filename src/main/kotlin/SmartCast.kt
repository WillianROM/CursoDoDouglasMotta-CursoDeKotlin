import java.lang.IllegalArgumentException


interface Expressao
class Numero(val valor: Int) : Expressao
class Soma(val esquerdo: Expressao, val direito: Expressao) : Expressao

fun avalicao(expressao: Expressao): Int {
    if (expressao is Numero) {
        return expressao.valor
    }

    if (expressao is Soma){
        return avalicao(expressao.esquerdo) + avalicao((expressao.direito))
    }

    throw IllegalArgumentException("Expressão é desconhecida")
}

fun main() { //psvm
    //(1 + 2) + 4
    val resulado = avalicao(Soma(Soma(Numero(1),Numero(2)), Numero(4)))

    println(resulado)
}