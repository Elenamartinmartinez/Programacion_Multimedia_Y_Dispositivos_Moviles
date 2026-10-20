fun main() {
    var n: Int

    do { //Pedir un número para hacer un ejercicio
        print("Introduce el ejercicio que quieras hacer (1-28, 0 para salir): ")
        n = readln().toInt()

        when (n) {
            0 -> println("¡Hasta luego!")
            1 -> ejercicio01()
            2 -> ejercicio02()
            3 -> ejercicio03()
            4 -> ejercicio04()
            5 -> ejercicio05()
            6 -> ejercicio06()
            7 -> ejercicio07()
            8 -> ejercicio08()
            9 -> ejercicio09()
            10 -> ejercicio10()
            11 -> ejercicio11()
            12 -> ejercicio12()
            13 -> ejercicio13()
            14 -> ejercicio14()
            15 -> ejercicio15()
            16 -> ejercicio16()
            17 -> ejercicio17()
            18 -> ejercicio18()
            19 -> ejercicio19()
            20 -> ejercicio20()
            21 -> ejercicio21()
            22 -> ejercicio22()
            23 -> ejercicio23()
            24 -> ejercicio24()
            25 -> ejercicio25()
            26 -> ejercicio26()
            27 -> ejercicio27()
            28 -> ejercicio28()
            else -> println("Ejercicio no válido")
        }

        println()
    } while (n != 0) //Mientras no sea 0, el búcle seguirá
}