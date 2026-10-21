fun ejercicio16() {
    //Pedimos dos números por pantalla
    print("Introduzca un número: ")
    val n1 = readln().toInt()
    print("Intrduzca otro número: ")
    val n2 = readln().toInt()
    //generar números aleatorios por pantalla
    var num = (n1..n2).random()
    var cont = 0
    do {
        num = (n1..n2).random()
        println(num)
        cont++
    } while (cont < 10)
}