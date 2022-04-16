fun main() {
    var numeroDigitado = arrayOfNulls<Int>(5)

    var soma : Int = 0

        for(i: Int in numeroDigitado.indices){

        println("Por favor digite o $i numero")
        numeroDigitado[i] = readln().toInt()

    }
    numeroDigitado.forEach { numero ->
        if (numero != null) {
            soma = numero + soma
        }
    }

    println( "A soma dos numero digitado foi $soma")
}