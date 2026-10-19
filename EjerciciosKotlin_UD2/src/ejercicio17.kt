fun ejercicio17() {
    //Pedir una cadena de texto por pantalla
    println("Introduce una cadena de texto: ")
    val cadena = readln()

    //Contadores de cada caracter que esté en la cadena de texto
    var contVocales = 0
    var contConsonantes = 0
    var contNums = 0
    var contEsBl = 0

    //Texto para detectar
    val vocales = "aeiouAEIOU"
    val consonantes = "bcdfghjklmnpqrstvwxyzBCFGHJKLMNPQRSTVWXYZ"
    val nums = "1234567890"
    val esBl = " "

    //Búcle for para ir contando los caracteres (uno a uno)
    for (c in cadena) {
        when (c) {
            in vocales -> contVocales++
            in consonantes -> contConsonantes++
            in nums -> contNums++
            in esBl -> contEsBl++
        }
    }

    //Mostrar por pantalla los resultados
    println("Resultados: ")
    println("Vocales [$contVocales]")
    println("Consonantes [$contConsonantes]")
    println("Números [$contNums]")
    println("Espacios en blanco [$contEsBl]")
}