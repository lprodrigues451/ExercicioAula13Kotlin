fun main() {
    var ano : Int
    var quantosAnos: Int
    var i : Int = 1

    println("Por favor informe o seu ano de nascimento")
    ano = readln().toInt()

    quantosAnos = 2022 - ano
    var anoVetor = arrayOfNulls<Int>(quantosAnos)

    for(i in 2022 downTo  ano ){
        println("No ano de $i você estava com ${quantosAnos+0} ano")
        quantosAnos--
    }
}