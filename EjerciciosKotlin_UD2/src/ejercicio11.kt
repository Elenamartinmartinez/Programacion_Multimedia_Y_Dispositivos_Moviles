fun ejercicio11() {
    val clave = "pato" //Clave que no se le mostrará al usuario
    var intentos = 3 //Número de intentos para introducir la clave
    var acertado = false

    do {
        print("Introduzca la contraseña: ")
        val intento = readln()

        if (intento == clave) {
            acertado = true
            println("Enhorabuena, acertaste")
        } else {
            intentos--
            println("Has fallado. Te quedan $intentos intentos")
        }
    } while (intentos > 0 && !acertado) //Termina si acierta o si se acaban los intentos
}