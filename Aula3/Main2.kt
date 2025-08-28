fun main(){

    /*val produtos = mutableListOf("PC", "Mouse", "Teclado")

    print(produtos[0])
    produtos[0] = "Notebook"

    print(produtos.joinToString())*/

    // val matriz = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))

    val produtos = mutableListOf("PC", "Mouse", "Teclado")

    println("Lista de Compras: ")
    for(i in 0..3){
        println(produtos[i])
    }
    println("--")
    for(item in produtos){
        println(item)
    }

    println("--")
    for((i, item) in produtos.withIndex()){
        print(i)
        println(item)
    }

    produtos.forEach {
        println(it)
    }

    produtos.forEach { item ->
        println(item)
    }



}