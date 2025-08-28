fun main(){

    // print("Digite seu nome: ")
    // val nome: String = readLine() ?: "sem nome"

    print("Ano: ")
    val ano = readLine()?.toIntOrNull()

    if(ano != null) {
        val idade = 2025 - ano
        println("Idade: $idade")
    }else{
        print("Erro..")
    }


}