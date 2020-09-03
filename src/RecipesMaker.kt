import java.util.*

fun main() {

    val menu = """
    Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()
    println(menu)

    val listaDeIngredientes = listOf<String>("1.Agua","2.Leche","3.Carne","4.Verduras","5.Frutas","6.Cereal","7.Huevos","8.Aceite")


    do {
    val response:String? = readLine()
        if (response.equals("1")){
            println("Hacer una receta")
            println(makeRecipe(listaDeIngredientes))
        }else if (response.equals("2")){
            println("Ver mis recetas")
        }else if (response.equals("3")){
            println("Salir")
        }else{
            println("Debe seleccionar una de las opciones dadas")
        }

    } while (response != "3")




}

fun makeRecipe(array: List<String>){
    for (i in array){
        println("$i")
    }
   val reader = Scanner(System.`in`)
    var opcion: Int = reader.nextInt()
    println("${viewRecipe(opcion)}")

}

fun viewRecipe(select: Int): String{
    var texto = "Ninguna seleccion"
    when(select){
        1 -> texto = "Ver recetas de Agua"
        2 -> texto = "Ver recetas de Leche"
        3 -> texto = "Ver recetas de Carne"
        4 -> texto = "Ver recetas de Verduras"
        5 -> texto = "Ver recetas de Frutas"
        6 -> texto = "Ver recetas de Cereal"
        7 -> texto = "Ver recetas de Huevos"
        8 -> texto = "Ver recetas de Aceites"
        else -> texto = "Debes ingresar un numero entre el 1 y el 8"
    }
    return texto
}
