fun main() {

    val menu = """
    Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()
    println(menu)

    val listaDeIngredientes = listOf<String>("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")
    /*for (i in listaDeIngredientes){
        println(i)
    }
    */

    do {
    val response:String? = readLine()
        if (response.equals("1")){
            println("Hacer una receta")
        }else if (response.equals("2")){
            println("Ver mis recetas")
        }else if (response.equals("3")){
            println("Salir")
        }else{
            println("Debe seleccionar una de las opciones dadas")
        }

    } while (response != "3")




}
