fun main() {
    var quantidadeAluno : Int
    var i : Int = 0
    var media : Double
    var soma : Int = 0

    println("Por favor digite a quantidade de aluno na sala: ")
    quantidadeAluno = readln().toInt()

    var alunoSala = arrayOfNulls<Int>(quantidadeAluno)

    while (i in alunoSala.indices){
        println("Por favor digite a nota do ${i+1} aluno ")
        alunoSala[i] = readln().toInt()

        soma += alunoSala[i]!!

        i++
    }

    media = (soma / quantidadeAluno).toDouble()
    println("Quantidade da média da sala foi : $media")

}