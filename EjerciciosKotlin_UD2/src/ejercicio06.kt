fun ejercicio06() {
    var op: String
    do {
        println("¿Cuál es la capital de España?")
        println("a. La Paz")
        println("b. Buenos Aires")
        println("c. Madrid")
        println("d. Bogotá")
        print("Opción: ")
        op = readln()

        if (op != "c") {
            println("La respuesta no es correcta...") //Se vuelve a preguntar
        }
    } while (op != "c") //Seguirá preguntando hasta que la respuesta sea la correcta

    println("¡Felicitaciones!") //Solo se llega aquí cuando la respuesta es correcta
}