// Crie um programa que calcule e exiba o resultado da média de temperaturas informadas pelo usuário

fun main() { //psvm
    var temperatura: Int = 0
    var somatorio: Int = 0
    var quantidade: Int = 0

    while(temperatura != 999){
        println("Digite uma temperatura ou 999 para sair:")

        temperatura = readLine()!!.toInt()  //readLine - Para receber um valor do usuário através de linha de comando, no Java é necessário fazer Scanner teclado = new Scanner(System.in); teclado.nextline();

        if(temperatura != 999){
            somatorio += temperatura //somatorio = somatorio + temperatura
            quantidade++
        }
    }

    println("A média das temperaturas é = ${somatorio/quantidade}")
}