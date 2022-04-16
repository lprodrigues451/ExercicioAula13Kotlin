fun main() {

    var listaNomes = arrayOf("Jessica", "Carol", "Rodrigo")
    // Exemplo pegando dados do usuário arrayOf()

    print("Digite a quantidade de nomes: ")
    val quantidadeNomes = readln().toInt()

    println("O array vai ter a capacidade de: $quantidadeNomes")

    var nomesUsuario = arrayOfNulls<String>(quantidadeNomes)

    print("por favor digite o nome 1 - ")
    nomesUsuario[0] = readln()

    print("por favor digite o nome 2 - ")
    nomesUsuario[1] = readln()

    println("O tamanho do array é de ${nomesUsuario.size}")

    var lista1 = arrayListOf<String>()
    while(true){
        var i = readln()
        lista1.add("$i")
    }


    //Exemplo de for percorrendo um vetor
    for (nomePosicaoArray: String in listaNomes){
        println(nomePosicaoArray)
    }

    for (i: Int in listaNomes.indices){
        println(listaNomes[i])
    }

    // Exemplo de for e forEach
    for (nomePosicaoArray: String in listaNomes){
        println(nomePosicaoArray)
    }

    listaNomes.forEach { nome -> println(nome) }

    listaNomes.forEach { nome ->
        val resultado = 2 + 2
        println("Nome no vetor: $nome e resultado da soma: $resultado")
    }

}