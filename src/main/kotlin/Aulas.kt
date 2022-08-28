
/*Curso de Kotlin | Básico #03 - Configurando o ambiente e criação do primeiro programa Kotlin conforme:
 *https://www.youtube.com/watch?v=A7mzcndP5lM&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=3*/

fun main(args: Array<String>){
    //fun = palavra reservada para declarar uma função
    //main = nome da função, no caso do main é o ponto de entrada
    //args: Array<String> = tipo da variável é declarado depois do nome
    println("Olá, Mundo!") //wrapper("embrulho") da biblioteca padrão do Java, com sintaxe mais concisa (System.out.println)
    //é omitido o ; (ponto e vírgula)
}


/* ************************************************************************************************************* */

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
   //fun maxExoressaoSemTipoDeRetornoa:Int,b:Int)=if(a>b) a else b


/* ************************************************************************************************************* */
//https://www.youtube.com/watch?v=cQC17DNfiQw&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=6
//Curso de Kotlin | Básico #05 - Entendendo Variáveis (var|val)

//Estrutura de uma variável
/* Representa um valor ou expressão (na memórias)
 * É declarada com a palavra-chave var|val seguido do nome
 * O tipo da variável pode ser especificado ou não depois do nome
 */

val nome1 = "Douglas" //inferência de tipo
var nome2:String = "João" //declaração do tipo
/*var nome3:String
nome3 = "Michel"*/

//var vs val
/* val (de valor) representa uma referência imutável, ou seja, seu estado não pode ser modificado após ser criado (jinal em Java)
 * var (de variável) representa uma referência mutável, ou seja, o valor da variável pode ser alterado após ser criada (variável regular em Java)
 * O tipo da variável pode ser especificado ou não depois do nome
 *  */
