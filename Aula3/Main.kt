fun main(){

    // System.out.print()
    print("Digite seu nome: ")
    // VAR - VAL
    // val nome = ""
    // nome = "Joao"
    // val nome = readLine() ?: "erro"

    print("Ano: ")
    val ano = readLine()

    /*if(ano != null){
        val idade = 2025 - ano.toInt()
    }*/

    // val idade = 2025 - (ano?.toInt() ?: 2025)
    val idade = 2025 - (ano?.toIntOrNull() ?: 2025)

    val ano2 = readLine()?.toIntOrNull() ?: 0
    val idade2 = 2025 - ano2

    val ano3 = readLine()?.toIntOrNull()
    if(ano3 != null){
        val idade3 = 2025 - ano2
    }else{
        val idade3 = 0
    }



}