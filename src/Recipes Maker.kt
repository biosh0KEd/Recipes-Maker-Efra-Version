fun main(args: Array<String>){
    do {
        println("Selecciona la opcion deseada")
        println("""
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
        """.trimMargin())
        val response: String? = readLine() ?: "0"
        when (response) {
            "1" -> println("Receta hecha $response")
            "2" -> println("Recetas vistas $response")
            "0" -> println("Debe ingresar una respuesta")
            else -> println("Lo ingresado no es una respuesta valida")
        }
    } while (!response.equals("3"))
}