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

    //mostrar resultados por pantalla
    println("Ventas introducidas: [$contVent]")
    println("Suma total de las ventas: [$sum]")
}