fun main() {
    var semanaVetor = arrayOfNulls<String>(8)

    semanaVetor[0]= null
    semanaVetor[1] = "Domingo"
    semanaVetor[2] = "Segunda"
    semanaVetor[3] = "Terca"
    semanaVetor[4] = "Quarta"
    semanaVetor[5] = "Quinta"
    semanaVetor[6] = "Sexta"
    semanaVetor[7] = "Sabado"

    println("Digite um numero de 1 a 7")
    var numero = readln().toInt()


    for (i : Int in semanaVetor.indices){
        if(numero == i){
            println(semanaVetor[i])

        }
    }

}