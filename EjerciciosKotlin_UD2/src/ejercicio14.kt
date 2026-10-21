fun ejercicio14() {
    //Número de ventas
    print("Introduzca el número de ventas realizadas este mes: ")
    val ventas = readln().toInt()
    var sum = 0.0 //<- Inicializamos la suma de las ventas
    var contVent = 1

    do {
        print("Introduzca la venta $contVent/$ventas: ")
        val cant = readln().toDouble()
        sum += cant //Va sumando las cantidades
        contVent++ //Contador de ventas
    } while (contVent <= ventas) //Se seguirá ejecutando hasta que se reúnan todas las ventas

    val resultado = "%.2f".format(sum) //Formatea la suma con dos decimales
    println("Suma de las ventas realizadas este mes: [$resultado]") //Muestra la suma por pantalla
}