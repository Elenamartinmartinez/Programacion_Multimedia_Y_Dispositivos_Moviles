fun ejercicio19() {
    //Pedir dos números por pantalla
    print("Introduzca un número: ")
    var n1 = readln().toFloat()
    print("Introduzca otro número: ")
    var n2 = readln().toFloat()

    var op: Int //Para elegir opción de que hacer
    do {
        println("=== MENÚ DE OPCIONES ===")
        println("1. suma los operandos.")
        println("2. resta los operandos.")
        println("3. multiplica los operandos.")
        println("4. divide los operandos.")
        println("5. potencia (1º operando como base y 2º como exponente).")
        println("6. módulo , resto de la división entre operando1 y operando2.")
        println("7. pedir 2 operandos nuevos.")
        println("8. Salir.")
        println("----------------------------------------------------------")
        print("Elige una opción: ")
        op = readln().toInt()

        //Definición de las operaciones
        val sum = n1 + n2
        val res = n1 - n2
        val mul = n1 * n2
        val div = n1 / n2
        val pot = Math.pow(n1.toDouble(), n2.toDouble())
        val mod = n1 % n2

        if (op == 1) { //Sumar los operandos
            println("[$n1 + $n2 = $sum]")
        } else if (op == 2) { //Restar los operandos
            println("[$n1 - $n2 = $res]")
        } else if (op == 3) {//Multiplicar los operandos
            println("[$n1 * $n2 = $mul]")
        } else if (op == 4) {//Dividir los operandos
            println("[$n1 / $n2 = $div]")
        } else if (op == 5) {//Potencia
            println("[$n1 ^ $n2 = $pot]")
        } else if (op == 6) {//Módulo
            println("[$n1 % $n2 = $mod]")
        } else if (op == 7) {//Nuevos valores para n1 y n2
            print("Introduzca un número: ")
            n1 = readln().toFloat()
            print("Introduzca otro número: ")
            n2 = readln().toFloat()
        }

        if (op == 8) println("¡Adios!")//Fin del programa

    } while (op != 8)
}