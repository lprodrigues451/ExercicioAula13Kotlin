fun main() {

    var quantidade : Int


    println("Por favor informe a quantidade da sua lista")
    quantidade = readln().toInt()

    var listaVetor = arrayOfNulls<String>(quantidade)

    for (i: Int in listaVetor.indices){

        println("Por favor insira o ${i+1} produto da lista ")
        listaVetor[i] = readln()
    }

    for (b: Int in listaVetor.indices){
        println("A ${b+1} adicionada foi ${listaVetor[b]}")
    }


}