fun ejercicio06() {
    println("¿Cuál es la capital de España?: ")
    val op = readln()
    println("a. Paris")
    println("b. Roma")
    println("c. Madrid")
    println("a. Buenos Aires")

    do { //Seguirá preguntando hasta que la respuesta sea la correcta
        println("La respuesta no es correcta...")
        println("¿Cuál es la capital de España?: ")
        val op = readln()
    } while (op != "c")

    //Lo que saldrá por pantalla cuando la respuesta sea correcta
    if (op == "c") {
        println("¡Felicitaciones!")
    }
}