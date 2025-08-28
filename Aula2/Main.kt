
fun main() {

    //var nome = "Joao"
    // nome = "Joao Silva"
    // nome = 22

    val nome: String = "Joao"
    val sobrenome: String? = null

    // System.out.println()
    // println("Nome: " + nome)
    println("Nome: $nome, Sobre: $sobrenome")

   // val idade: String = "20"
    /*val ano = "2000" // input em string
    val idade = 2025 - ano.toInt()
    print("Idade: $idade")*/

    /*val ano = "200a" // input em string
    val anoEmInt = ano.toIntOrNull() ?: 2025
    val idade = 2025 - anoEmInt
    print("Idade: $idade")*/

    val ano = "200a" // input em string
    val anoEmInt = ano.toIntOrNull()
    if(anoEmInt != null){
        val idade = 2025 - anoEmInt
        print("Idade: $idade")
    }else{
        print("Erro...")
    }

}