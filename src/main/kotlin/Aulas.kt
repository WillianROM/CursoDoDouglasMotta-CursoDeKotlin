
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

/* ************************************************************************************************************* */
//https://www.youtube.com/watch?v=kCH3wJnq8ig&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=8
//Curso de Kotlin | Básico #06 - String Templates

/*Formatação de strings mais fácil
*
* É possível referenciar variáveis locais em strings literais por colocar o caractere $ antes do nome da variável
* Isso equivale à concatenção de strins no Java ("hello " + nome + "!")
* É possível fazer o escape da variável para o compilador não interpretá-la como template ("\$x)"
* Pode ser utilizada também com expressões
* */

/* ************************************************************************************************************* */
//https://www.youtube.com/watch?v=_gkRtxjhbNo&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=8
//Curso de Kotlin | Básico #07 - Classes

/*Um pouco de orientação a objetos
*
* Também conhecido como POO, é um paradigma (classificação) de programação baseado no conceito de "objetos"
* Objetos podem conter dados (atributos) e procedimentos (métodos) e são elementos fundamentais na construção da solução
* Objetos são instâncias de classes
* Um objeto é uma abstração de algum fato ou ente do mundo real
* */

/*Classe
*
* É uma descrição que abstrai um conjunto de objetos com características similares
* Descreve as propriedades/estados (atributos) possíveis e as ações/comportamentos (métodos) de um conjunto de objetos
* */

//Classe Java x Classe Kotlin
/*Classe Java
public class classes.Pessoa{

    private final String nome;
    private final int idade;

    public classes.Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
}
*/

//Classe Kotlin
class PessoaAula07 (
    val nome: String,
    val idade: Int
    )
/*
* objetos valor (value objects) - contém apenas dados (sem códigos)
* Public é a visibilidade default em Kotlin
*/

/* ************************************************************************************************************* */
//https://www.youtube.com/watch?v=zbkMTSxmL9c&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=10
//Curso de Kotlin | Básico #08 - Propriedades

/* Propriedades em Java
*
* A ideia de uma classe é encapsular dados e códigos que trabalham sobre esses dados dentro de uma única entidade
* Em Java, o dado é armazenado em campos, que são usualmente privados
* Se você necessita deixar o cliente da classe acessar esse dado, você fornece métodos assossores: um getter e possivelmente um setter
* Em Java, a combinação de campo e seu assessor é frequentemente referenciado como uma propriedade
* */

/* Propriedades em Kotlin
*
* Funcionalidade de linguagem de primeira-classe
* Inteiramente substitui campos e métodos assessores*/

class PessoaAula08 (
    val nome: String, //<- Criando uma propriedade em Kotlin
    val idade: Int,
    var isCasado: Boolean
)