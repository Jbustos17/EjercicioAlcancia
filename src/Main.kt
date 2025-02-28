import kotlin.random.Random

fun main() {

    println("Ingrese la Cantidad de dinero:")
    val input = readLine()
    var dinero = input?.toDoubleOrNull() ?: return println("Cantidad Invalida De Juego")// toDoubleOrNull se utiliza para convertir una cadena en un numero de punto flotante


    while (dinero > 0){

        val numero = Random.nextInt(1,4)
        println("Salio el numero: $numero")

        when (numero){

            3->{
                println("Perdiste todo tu dinero, FIN DEL JUEGO")
                dinero = 0.0
            }
            2-> {
                dinero /= 2
                println("Pierdes la mitad de tu dinero: $dinero ,Pero puedes seguir jugando")
                println("Deseas seguir jugando (si/no)")
                if (readLine()?. lowercase() != "si") break

            }
            1->{
                dinero *= 2
                println("Ganaste, Duplicaste tu dinero, ahora tienes: $dinero ")
                println("Deseas seguir jugando (si/no)")
                if (readLine()?. lowercase() != "si") break

            }
        }

    println("Juego Terminado, Gracias por jugar en casino JBustos17")

    }
}







