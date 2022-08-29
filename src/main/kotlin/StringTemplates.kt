import kotlin.io.println
import kotlin.io.println as println1

fun main() { //psvm
    val nome: String = "Doug"
    System.out.println("Hello " + nome + "! pelo Java") //Como é no Java
    println("Hello $nome! pelo Kotlin") //Como é no Kotlin
    println( "Para anular use \\ antes do cifrão, por exemplo \$nome")

    println("A soma é: ${soma(10,20)}") //Para executar uma função dentro da mensagem, coloque a função dentro de ${}, exemplo ${funcao()}
}

fun soma(a:Int, b:Int):Int{
    return  a + b
}