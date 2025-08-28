fun main(){
    val nome: String = "Joao"
    val sobrenome: String? = "Silva"
    println("Nome: $nome, Sobre: $sobrenome")

    val nomeCompleto = nome + sobrenome
    var nomeCompleto2 = "$nome $sobrenome Sil va Sauro"
    println(nomeCompleto)
    println(nomeCompleto.length)
    println(nomeCompleto[4])
    println(nomeCompleto.substring(3, 6))

    nomeCompleto2 = nomeCompleto2.replace("Silva", "Pereira")
    println(nomeCompleto2)

    println(nomeCompleto2.split(" "))

}