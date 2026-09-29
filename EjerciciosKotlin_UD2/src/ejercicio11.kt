fun ejercicio11() {
    val clave = "pato" //Clave que no se le mostrará al usuario
    var intentos = 2 //Número de intentos para introducir la clave

    print("Introduzca la contraseña: ")
    val intento = readln()

    if (intento != clave) {
        do {
            intentos--
            println("Contraseña incorrecta...")
            println("Introduza la contraseña: ")
            val intento = readln()
        } while (intentos > 0)

    } else if (intento == clave) {
        println("¡Bienvenido!")
    }
}