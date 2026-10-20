fun ejercicio28() {
    //Pedir una cadena de texto por pantalla
    print("Introduce una cadena de texto: ")
    var t = readln()

    //Darle al usuario las opciones para modificar el texto
    var op : Int
    do {
        println("-----------------------------------------------")
        println("1.- Convertir todo el texto a mayúsculas.")
        println("2.- Convertir todo el texto a minúsculas.")
        println("3.- Nueva cadena de texto: ")
        println("4.- Salir.")
        println("-----------------------------------------------")
        print("Elige una opción: ")
        op = readln().toInt()

        if (op == 1) {
            println(t.uppercase())//Muestra toda la cadena en mayúsculas
        } else if (op == 2) {
            println(t.lowercase())//Muestra toda la cadena en minúsculas
        } else if (op == 3) {
            print("Introduce una cadena de texto: ")//Nueva cadena de texto
            t = readln()
        } else if (op == 4) {
            println("¡Adios!")//Fin del programa
        }
    } while (op != 4)
}