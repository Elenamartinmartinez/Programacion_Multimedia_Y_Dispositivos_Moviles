fun ejercicio05() {
    println("Introduce un número: ")
    val num = readln().toInt() //Se pasa directamente a Int

    if (num % 2 == 0) {
        println("$num SI es divisible entre 2")
    } else {
        println("$num NO es divisible entre 2")
    }
}