fun main(){

    print("Texto: ")
    val texto = readLine() ?: ""
    val invertido = texto.reversed()

    if(texto.lowercase() == invertido.lowercase()){
        print("sim")
    }else{
        print("não")
    }

}