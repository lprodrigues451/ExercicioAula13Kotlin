fun soma1E15(): Int {
    var soma = 0
    var i: Int
    i = 0
   do {
        soma = soma + i
        i++
    }  while (i <= 15)

    return soma
}
fun main() {
    val soma1 = soma1E15()
    println("A soma dos número de 1 a 15 é :$soma1")
}

