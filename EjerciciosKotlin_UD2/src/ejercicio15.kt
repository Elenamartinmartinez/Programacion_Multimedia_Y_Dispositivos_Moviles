fun ejercicio15() {
    var sum = 0.0
    var contVent = 1

    while (true) { //Pedimos ventas por pantalla
        print("Introduzca la venta $contVent (introduce * para terminar): ")
        val ventas = readln().trim()

        if (ventas == "*") {
            break//Si se pone un * se acaba el programa
        }

        sum += ventas.toDouble() //Si la venta es válida se suma
        contVent ++ //Si la venta es válida, el contador añade 1 más
    }
    //Mostrar resultado por pantalla
    val resultado = "%.2f".format(sum) //Formatea la suma con dos decimales
    println("Suma de las ventas realizadas este mes: [$resultado]") //Muestra la suma por pantalla
}