fun main() {
    val quinzeNumero = arrayOfNulls<Int>(15)
    var i : Int = 0
    var soma : Int = 0
    var media : Double

    for (i in quinzeNumero.indices){
        println("Informe um número ${i+1}")
        quinzeNumero[i] = readln().toInt()
        soma = soma + quinzeNumero[i]!!
    }
   media = (soma / 15).toDouble()
    println("A media da nota foram de: $media")
}