package classes

class PessoaKotlin (
    val nome: String,
    val idade: Int
    )

fun main() {//psvm
    val pessoa1: PessoaKotlin = PessoaKotlin("Doug", 16)
    val pessoa2: PessoaKotlin = PessoaKotlin("Diogo", 23)

    println("O ${pessoa1.nome} tem ${pessoa1.idade} amos, enquanto ${pessoa2.nome} tem ${pessoa2.idade} anos.")

}

