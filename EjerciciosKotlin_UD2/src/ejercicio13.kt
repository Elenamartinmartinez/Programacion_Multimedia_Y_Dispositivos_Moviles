fun ejercicio13() {
    //Pedir un día de la semana por pantalla
    println("Introduce un día de la semana: ")
    val d = readln().lowercase()

    when (d) {
        "lunes", "martes","miércoles", "jueves","viernes" -> println("Es un día laborable")
        "sábado","domingo" -> println("Es fin de semana")
        else -> println("día no válido")
    }
}