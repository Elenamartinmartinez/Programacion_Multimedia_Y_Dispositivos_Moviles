fun ejercicio25() {
    //Pedir un número por pantalla
    print("Introduce un número por pantalla: ")
    val n = readln().toInt()

    var esPrimo = n > 1 //Solo los positivos pueden ser números primos
    var i = 2
    while (esPrimo && i * i <= n) { //Calcula si un número es primo
        if (n % i == 0){
            esPrimo = false
        }
        i++
    }

    if (esPrimo) {
        println("$n SI es un número primo")
    } else {
        println("$n NO es un número primo")
    }
}