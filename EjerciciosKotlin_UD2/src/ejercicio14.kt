fun ejercicio14() {
    //Número de ventas
    print("Introduzca el número de ventas realizadas este mes: ")
    val ventas = readln().toInt()
    var sum = 0.0 //<- Inicializamos la suma de las ventas
    var contVent = 1;

    do {
        print("Introduzca la venta $contVent/$ventas: ")
        val cant = readln().toDouble()
        sum += cant //Va sumando las cantidades
        contVent ++ //Contador de ventas
    } while (contVent <= ventas) //Se seguirá ejecutando hasta que se reunan todas las ventas

    println("Suma de las ventas realizadas este mes: [$sum]") //Muestra la suma por pantalla
}