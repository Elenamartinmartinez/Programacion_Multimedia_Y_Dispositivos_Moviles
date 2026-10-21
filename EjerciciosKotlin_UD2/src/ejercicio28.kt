fun ejercicio28() {
    //Pedir una frase por pantalla
    print("Introduce una frase: ")
    val frase = readln()

    //Pedir la opción hasta que sea válida
    var op: Int
    do {
        println("--------------------------------------------")
        println("1.- Convertir a mayúsculas.")
        println("2.- Convertir a minúsculas.")
        println("--------------------------------------------")
        print("Elige una opción: ")
        op = readln().toInt()
    } while (op != 1 && op != 2) //Se repite si la opción no es válida

    //Mostrar el resultado
    if (op == 1) {
        println(frase.uppercase())
    } else {
        println(frase.lowercase())
    }
}