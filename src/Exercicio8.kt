fun main() {

    var valorDigitado : Int
    println("Por favor digite um número inteiro ")
    valorDigitado  = readln().toInt()

    var resultado : Int = fibonacci(valorDigitado)

    println("Onde $valorDigitado é o $resultado - ésimo termo da série de Fibonacci")
}
fun fibonacci(valor:Int):Int {
    return  if (valor == 1) 0
    else if (valor == 2 ) 1
    else fibonacci(valor-1) +  fibonacci(valor- 2)
}