fun main() {
    var numeroVetor = arrayOfNulls<Int>(4)
    var i : Int

    for (i in numeroVetor.indices) {
        println("Por favor informe o $i")
        numeroVetor[i] = readln().toInt()

    }

    numeroVetor.forEach { numero ->
        if (numero != null) {
            if (numero % 2 == 0) {
                println(numero)
            }
        }
    }



}