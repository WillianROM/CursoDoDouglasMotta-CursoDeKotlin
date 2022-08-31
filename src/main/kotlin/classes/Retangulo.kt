package classes

class Retangulo(val altura: Int, val largura: Int) {
    val isQuadrado
        get() = altura == largura

    /* O método acessor customizado acima é mesma coisa que criar a seguinte função:

    fun isQuadrado(): Boolean{
        return altura == largura
    }*/
}

fun main() {
    val retangulo : Retangulo = Retangulo(10,10)
    println(retangulo.isQuadrado)
}