fun main() {

    val vetorNumero = IntArray(2)
    var i: Int
    var opcao: Int
    i = 0
    while (i < vetorNumero.size) {
        println("Digite o " + (i + 1) + " número ")
        vetorNumero[i] = readln().toInt()
        i++
    }
    menu()
    opcao = readln().toInt()

    when(opcao){
        1 -> println(" O resultado da adição da soma dos números ${vetorNumero[0]} e ${vetorNumero[1]} foi : ${(vetorNumero[0] + vetorNumero[1])}")
        2 -> println("O resultado da multiplicação dos números ${vetorNumero[0]} e ${vetorNumero[1]} foi  = ${(vetorNumero[0] * vetorNumero[1])}")
        3 -> println("O resultado da divisão dos números ${vetorNumero[0]} e ${vetorNumero[1]} foi = ${(vetorNumero[0] / vetorNumero[1])}")
        4 -> println("O resultado da subtração dos números ${vetorNumero[0]} e ${vetorNumero[1]} foi  = ${(vetorNumero[0] - vetorNumero[1])}")
        5 -> System.exit(0)
    }
}
fun menu() {
    println("\n\t Escolha alguma da operação matematica ")
    println("\t----------------------------------------\n")
    println("1. Adição")
    println("2. Multiplicação ")
    println("3. Divisão")
    println("4. Subtração")
    println("0. Sair")
}