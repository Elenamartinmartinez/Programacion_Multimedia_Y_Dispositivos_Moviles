fun ejercicio20() {
    //Pedir un número mayor que 1
    var num: Int
    do {
        print("Inserta un número entero mayor que 1: ")
        num = readln().toInt()
    } while (num <= 1) //En caso de ser menor o igual a 1, se seguirá pidiendo un número

    //Iniciar la suma de los números
    var sum = 0
    for (i in 1..num) {
        sum = sum + i
    }
    println("La suma de 1 hasta $num es: $sum")
}