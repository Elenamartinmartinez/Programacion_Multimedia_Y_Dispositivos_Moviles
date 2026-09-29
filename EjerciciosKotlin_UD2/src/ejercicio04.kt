fun ejercicio04() {
    //Pedir 2 números por pantalla
    println("Introduce tu primer número: ")
    val num1 = readln()
    val n1 : Int = num1.toInt() //Lo pasamos de String a Int
    println("Introduce tu segundo número: ")
    val num2 = readln()
    val n2 : Int = num2.toInt()

    //Ver cual es mayor o si son iguales
    if (n1 > n2) {
        println("$n1 es mayor")
    } else if (n2 > n1) {
        println("$n2 es mayor")
    } else {
        println("$n1 y $n2 son iguales")
    }
}