
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

/* ************************************************************************************************************* */
//https://www.youtube.com/watch?v=bLuSVu7sV44&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=10
//Curso de Kotlin | Básico #09 - Assessores Customizados

/*Assessores Customizados
*
* Em Kotlin podemos escrever assessores de propriedades customizados*/

class RetanguloAula09(val altura: Int, val largura: Int){
    val isQuadrado:Boolean               //isQuadrado não necessita de um campo para guardar seu valor
        get() {                          //Somente tem um getter customizado com a implementação fornecida
            return altura == largura     //O valor é computado toda vez que a propriedade é acessada
        }
}

/* ************************************************************************************************************* */
//https://www.youtube.com/watch?v=NUVypzlZWks&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=12
//Curso de Kotlin | Básico #10 - Estrutura de Diretórios e Pacotes

/*Layout do Código Fonte: Diretórios e Pacotes
*
* Organização: Pacotes e Diretórios
*
* Kotlin também tem o conceito de pacotes, similar ao Java
* Todo arquivo Kotlin pode ter uma declaração de pacote no início
* Todas as declarações (classes, funções e propriedades) definidas no arquivo vão ser colocadas nesse pacote
* Declarações definidas em outros arquivos podem ser usados diretamente se eles estão no mesmo pacote; eles necessitam ser importados se eles estão em um pacote diferente
* Kotlin não faz distinção entre importação de classes e funções (top level)
* Em Java as classes devem seguir uma hierarquia de diretórios que casam com a estrutura de pacotes
* Em Kotlin, você pode colocar várias classes no mesmo arquivo e escolher qualquer nome para esse arquivo
* Kotlin também não impõe qualquer restrição sobre o layout de arquivos fonte no disco
* Na maioria dos casos, contudo, ainda é uma boa prática seguir o layout de diretórios dos Java para organizar arquivos fontes dentro de diretórios de acordo com a estrutura de pacotes.
* */

/* ************************************************************************************************************* */
//https://www.youtube.com/watch?v=RdViuF1z2J4&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=11
//Curso de Kotlin | Básico #11 - Enums

/*Um enum é uma "classe" especial que representa um grupo de constantes (variáveis imutáveis, como variaveis 'final' no Java*/

//Declarando classes enum no Kotlin

enum class CorExemplo{
    VERMELHO, LARANHA, AMARELO, VERDE, AZUL
}

/*
* Esse é um caso raro onde uma declaração em Kotlin usa mais palavras chave do que o correspondente em Java: enum class vs somente enum
* Em Kotlin, enum é chamado de soft-keyword
* Significado especial quando ela vem antes de class, mas podemos usá-la como um nome regular em outros lugares (val enum = "abc")
* Assim como em Java, enums não são lista de valores: podemos declarar propriedades e métodos em classes Enum*/

/* ************************************************************************************************************* */
//https://www.youtube.com/watch?v=rrH5sHGmp9A&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=15
//Curso Kotlin | Básico #12 - Expressão When

/*Construção "when" e enum em Kotlin
*
* "when" é um substituto do "switch" do Java
* Porém mais poderoso e é usado mais frequentemente
* "when" é uma expressão que retorna um valor (corpo de expressão), assim como o "if".
* Não precisamos escrever afirmações "break" em cada branch, como em Java
* Podemos também combinar múltiplos valores no mesmo branch separando por vírgulas*/

/* ************************************************************************************************************* */
//https://www.youtube.com/watch?v=wIMteSQBDIw&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=14
//Curso de Kotlin | Básico #13 - Smart Casts

/*Entendendo Smart Cast
*
* A palavra chave "is" é equivalente ao "instanceof" no Java (Verificação de tipo de uma variável)
* Em Java, é sempre preciso fazer um cast explícito após a verificação de um tipo com "instanceof"
* No Kotlin, o compilador faz esse trabalho para nós
* Se uma verificação foi feita para um certo tipo, não é preciso fazer um cast explícito depois da verificação
* O cast feito automaticamente pelo compilador é chamado de "Smart Cast"*/

/* ************************************************************************************************************* */
//https://www.youtube.com/watch?v=ERirCUX0jNs&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=15
//Curso de Kotlin | Básico #14 - Blocos como Ramificações

/*Blocos como ramificações de "if" e "when"
*
* Blocos como ramificações
*
* Ambos, "if" e "when" podem ter blocos como ramificações
* A última expressão do bloco é o resultado
* A afirmação anterior é verdadeira em todos os casos onde um bloco pode ser usado e um resultado é esperado
* Essa regra só não é verdadeira para funções regulares, que possuem ou um corpo de expressão que não pode ser um bloco, ou um corpo de bloco com um retorno explícito dentro (return)
* */

/* ************************************************************************************************************* */
//https://www.youtube.com/watch?v=kDKjzHRIQ-M&list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn&index=16
//Curso de Kotlin | Básico #15 - Laço de Repetição While (Primeiro Programa Interativo)

/*Laços de repetição "while"
*
* De todas as funcionalidades vistas até agora, iteração em Kotlin é provavelmente a mais similar ao Java
* O laço "while" é idêntico ao Java
* O laço "for" existe em uma única forma, que é equivalente ao laço "for-each" no Java
* No Kotlin existe os laços "while" e "do-while", que não diferem deos seus correspondentes laços em Java.
* */
