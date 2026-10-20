fun ejercicio21() {
    //Pedir una cadena de texto por pantalla
    print("Introduce una cadena de texto: ")
    val t = readln()
    val tNuevo = t.replace(" ", "")
    println("Cadena de texto sin espacios: $tNuevo")
}