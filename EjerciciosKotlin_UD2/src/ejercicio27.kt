fun ejercicio27() {
    println("--------------------------------------------------------------")
    println("Introduce valor numérico + Enter. Valor numérico + Enter....")
    println("Cuando quieras terminar, teclea -1 + Enter")
    println("--------------------------------------------------------------")
    var num : Int //Variable para los números
    var contN : Int = 0 //Contador
    do {
        print("")//Para introducir números por pantalla
        num = readln().toInt()
        if (num != -1) contN++//El contador cuenta todos los números menos -1
    } while (num != -1)

    println("Fin, has introducido $contN números")
}