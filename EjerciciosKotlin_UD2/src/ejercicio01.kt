fun ejercicio01() {
    //Declarar dos variables
    val num1 = 5
    val num2 = 10

    println("Los números son [$num1 ; $num2]")
    //Sumar las variables
    val sum1 = num1 + num2 //Mismo resultado sin importar el orden
    //Mostramos el resultado por pantalla
    println("*** SUMA")
    println("Resultado de ($num1 + $num2) = $sum1")
    println("_________________________________________________________")

    //Restar las variables
    val res1 = num1 - num2 //El orden de los números cambia el resultado
    val res2 = num2 - num1
    //Mostramos los resultados por pantalla
    println("*** RESTAS")
    println("Resultado de ($num1 - $num2) = $res1")
    println("Resultado de ($num2 - $num1) = $res2")
    println("_________________________________________________________")

    //Múltiplicar las variables
    val mul1 = num1 * num2 //Mismo resultado sin importar el orden
    println("*** MULTIPLICACIÓN")
    //Mostramos el resultado por pantalla
    println("Resultado de ($num1 * $num2) = $mul1")
    println("_________________________________________________________")

    //Dividir las variables
    println("*** DIVISIÓN")
    val div1 = num1 / num2 //El orden de los números altera el resultado
    val div2 = num2 / num1

    println("Resultado de ($num1 / $num2) = $div1")
    println("Resultado de ($num2 / $num1) = $div2")
    //Resto de la división
    val mod1 = num1 % num2
    val mod2 = num2 % num1

    println("Resultado de ($num1 % $num2) = $mod1")
    println("Resultado de ($num2 % $num1) = $mod2")

    println("_________________________________________________________")
}