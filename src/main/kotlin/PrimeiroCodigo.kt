/*
/*Curso de Kotlin | Básico #03 - Configurando o ambiente e criação do primeiro programa Kotlin conforme:
 *https://www.youtube.com/watch?v=A7mzcndP5lM&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=3*/

fun main(args: Array<String>){
    //fun = palavra reservada para declarar uma função
    //main = nome da função, no caso do main é o ponto de entrada
    //args: Array<String> = tipo da variável é declarado depois do nome
    println("Olá, Mundo!") //wrapper("embrulho") da biblioteca padrão do Java, com sintaxe mais concisa (System.out.println)
    //é omitido o ; (ponto e vírgula)
}
 */

/* ************************************************************************************************************* */
/*
/* Curso de Kotlin | Básico #04 - Entendendo Funções
* https://www.youtube.com/watch?v=yXHhVvJznuU&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=5*/

//Estrutura básica de uma função Kotlin

 //(a:Int,b:Int) =(lista de parâmetros)
//:Int{ = Tipo de retorno, no Kotlin sempre vem depois da declaração de parâmetros
fun maxBloco(a:Int,b:Int):Int{
    return if (a>b) a else b //Corpo da função
    //No Kotlin, 'if' é uma expressão, não uma declaração, ao contrário do Java que seria uma declaração.
    //Expressão tem valor próprio
    //A maioria das estrutura de controle são expressões, exceto os loops (for, do, do/while)

     //Corpo de bloco vs corpo de expressão
     //Corpo de bloco é quando uma função é escrita com seu corpo dentro de chaves({}) - Tipo de retorno é obrigatório - Declaração return também é obrigatória
}

    //Corpo de expressão é quando uma função consiste de apenas uma expressão (valor)
    fun maxExpressao(a:Int,b:Int):Int=if(a>b) a else b

    //No corpo de expressão podemos omitir o tipo de retorno
   fun maxExoressaoSemTipoDeRetornoa:Int,b:Int)=if(a>b) a else b
*/
