fun main() {
    var nomeBanda: String
    var musicaVetor = arrayOfNulls<String>(3)
    var i : Int
    println("Digite o nome da banda")
    nomeBanda = readln()

    for (i in musicaVetor.indices){
        println("Por favor digita a ${i+1} musica da $nomeBanda")
        musicaVetor[i] = readln()
    }
    println("----------------------------------------------------------")

    println("A banda $nomeBanda")
    for (j: Int in musicaVetor.indices){
        println("A $j musica ${musicaVetor[j]}")

    }

}