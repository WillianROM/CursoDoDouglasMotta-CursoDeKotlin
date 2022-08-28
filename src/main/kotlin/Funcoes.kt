fun main() { //psvm
    println(max(15, 10))
    println(maxEx(15, 17))
}

// Corpo de bloco
fun max (a:Int,b:Int):Int{
    return if(a > b) a else b
}

// Corpo de expressão
fun maxEx(a:Int,b:Int):Int=if(a>b) a else b
//Também daria para omitir o tipo de retorno: fun maxEx(a:Int,b:Int)=if(a>b) a else b