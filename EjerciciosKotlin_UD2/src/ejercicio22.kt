fun ejercicio22() {
    //Pedir cadenas de texto hasta que se dé una cadena en blanco
    var texto : String
    var resultado = ""
    do {
        print("Introduce un texto, cadena vacía para terminar: ")
        texto = readln()
        if (texto != "") {
            resultado += "$texto\n"
        }
    } while (texto != "")
    println("Cadena de texto resultante:")
    println("-----------------------------------")
    println(resultado)
}