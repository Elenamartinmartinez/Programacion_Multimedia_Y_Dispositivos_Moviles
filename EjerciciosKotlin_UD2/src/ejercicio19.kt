fun ejercicio19() {
    //Pedir dos números por pantalla
    print("Introduzca un número: ")
    val n1 = readln()
    print("Introduzca otro número: ")
    val n2 = readln()

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
    } while (op != 8)
}