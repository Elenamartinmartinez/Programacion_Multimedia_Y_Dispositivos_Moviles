fun ejercicio12() {
    //Pedir un mes por pantalla
    println("Introduce un mes (con el número del 1 al 12): ")
    val mes = readln().toInt()

    //Dependiendo del número pasará o que muestre el mes o no
    val result = when (mes) {
        1 -> "enero"
        2 -> "febrero"
        3 -> "marzo"
        4 -> "abril"
        5 -> "mayo"
        6 -> "junio"
        7 -> "julio"
        8 -> "agosto"
        9 -> "septiembre"
        10 -> "octubre"
        11 -> "noviembre"
        12 -> "diciembre"
        else -> "Ese no es un mes válido"
    }
    if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
        println("El mes de $result tiene 30 días")
    } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
        println("El mes de $result tiene 31 días")
    } else if (mes == 2) {
        println("El mes de $result tiene 28 días")

    }
}