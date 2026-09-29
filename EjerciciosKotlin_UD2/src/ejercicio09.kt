fun ejercicio09() {
    var num = 100
    for (num in 100 downTo 1) { //Muestra los números desde el 100 al 1
        if ((num % 2 == 0)||(num % 3 == 0)) { //Solo se mostrarán por pantalla si son divisbles entre 2 o 3
            println("$num")
        }
    }
}