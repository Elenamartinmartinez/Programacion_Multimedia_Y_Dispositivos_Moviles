fun ejercicio26() {
    print("Introduce el primer valor: ")
    val inicio = readln().toInt()
    print("Introduce el segundo valor: ")
    val fin = readln().toInt()

    println("Números primos entre $inicio y $fin:")
    for (num in inicio..fin) {
        var esPrimo = num > 1
        var i = 2
        while (esPrimo && i * i <= num) {
            if (num % i == 0) {
                esPrimo = false
            }
            i++
        }
        if (esPrimo) {
            println(num)
        }
    }
}