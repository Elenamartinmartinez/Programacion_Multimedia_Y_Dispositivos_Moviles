fun ejercicio10() {
    println("Introduce un número: ")
    val num = readln().toInt()

    while(num < 0) { //El número no puede ser menor a 0, seguir pidiendo en caso de que de un número así
        println("$num es menor a 0...")
        println("Introduce un número: ")
        val num = readln().toInt()
    }

    if (num > 0) { //En caso de que el número sea mayor
        println("$num es mayor a 0")
    } else if (num == 0) { //En caso de que el número sea igual
        println("$num es 0")
    }
}