fun main() {

    var intentos = 0
    var accesoconcedido = false

    while (intentos < 3 && !accesoconcedido) {
        print("INGRESE SU CODIGO DE ACCESO: ")
        val codigoInput = readLine()
        val codigo = codigoInput?.toIntOrNull()

        if (codigo == null) {
            println("CODIGO INVALIDO, INTENTELO DE NUEVO.")
            intentos++
            continue
        }

        if (codigo in 1000..1999) {
            println("EMPLEADO CON ID: $codigo")
            accesoconcedido = true
        } else if (codigo in 2000..2999) {
            print("INGRESE SU NOMBRE: ")
            val nombre = readLine() ?: ""
            print("INGRESE EL MOTIVO DE SU VISITA: ")
            val motivo = readLine() ?: ""
            println("VISITANTE $nombre, MOTIVO DE VISITA: $motivo.")
            accesoconcedido = true
        } else {
            intentos++
            println("CÓDIGO INCORRECTO ($intentos intento(s)).")
        }
    }

    if (!accesoconcedido) {
        println("ACCESO BLOQUEADO")
    }
}





