fun ejercicio23() {
    //Solicitar por pantalla una cadena de texto
    print("Escribe una frase: ")
    val frase = readln()
    val palabras = frase.split(" ")

    println("Palabras sueltas: ")
    for (palabra in palabras) {
        println(palabra)
    }
}