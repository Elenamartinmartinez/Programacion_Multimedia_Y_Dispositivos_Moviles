fun ejercicio11() {
    val clave = "pato" //Clave que no se le mostrará al usuario
    var intentos = 3 //Número de intentos para introducir la clave

    print("Introduzca la contraseña: ")
    var intento = readln()
    do {
        if (!(intento.equals(clave))) {
            intentos--
            println("Contraseña incorrecta...")
            println("Intentos restantes [$intentos]")
            print("Introduza la contraseña: ")
            intento = readln()
        }
    } while (intentos > 0&&intento != clave)

    if (intento == clave) {
        println("¡Bienvenido!")
    }
}