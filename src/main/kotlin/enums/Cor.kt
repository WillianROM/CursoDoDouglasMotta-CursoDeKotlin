package enums

enum class Cor(val vermelho:Int, val verde: Int, val azul: Int) {//parâmentro em RGB - Red, Green and Blue
    VERMELHO(255,0,0),
    LARANJA(255,165,0),
    AMARELO(255,255,0),
    VERDE(0, 255,0),
    AZUL(0,0,255);

    //ponto e vírgula (;) é obrigatório no enum class para separar as constantes das funções de um enum

    fun rgb() = ((vermelho * 256 + verde) * (256 + azul)) //Para converte rgb para decimal

}

fun main() { //psvm
    val rgb = Cor.VERMELHO.rgb()
    println(rgb)
}