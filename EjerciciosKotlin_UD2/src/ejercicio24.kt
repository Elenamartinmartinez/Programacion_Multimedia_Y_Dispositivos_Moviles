fun ejercicio24() {
    //Pedir números por pantalla
    var num : Int
    //Operaciones que se realizarán en el búcle
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    var sumTd = 0
    var sumP = 0
    var sumN = 0
    do {
        print("Introduce un número: ")
        num = readln().toInt()
        if (num != -1) { //Mientras no sea -1, se hará lo siguiente
            if (num > max) { max = num }
            if (num < min) { min = num }
            if (num < 0) {sumN = sumN + num} //No suma los negativos
            if (num > 0) {sumP = sumP + num}
            sumTd += num
        }
    } while (num != -1) //El búcle continua mientras no sea un -1
    //Mostrar resultados por pantalla
    println("El menor es: $min")
    println("El mayor es: $max")
    println("La suma es: $sumTd")
    println("La suma de los positivos es: $sumP")
    println("La suma de los negativos es: $sumN")
}