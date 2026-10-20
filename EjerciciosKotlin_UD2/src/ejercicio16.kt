fun ejercicio16() {
    //Pedimos dos números por pantalla
    print("Introduzca un número: ")
    val n1 = readln().toInt()
    print("Intrduzca otro número: ")
    val n2 = readln().toInt()

    val num = (n1..n2).random()
    println(num)
}