fun main(){

    print("Texto: ")
    val texto = readLine()

    print("Inicio: ")
    val inicio = readLine()?.toIntOrNull() ?: 0

    print("Fim: ")
    val fim = readLine()?.toIntOrNull() ?: texto?.length

    print(texto?.substring(inicio, fim!!))

}