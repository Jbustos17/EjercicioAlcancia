import kotlin.random.Random

fun main() {

    var contador = 1
    var sumaDado1 = 0
    var sumaDado2 = 0

    while (contador <= 10) {
        val dado1 = Random.nextInt(1, 7)
        val dado2 = Random.nextInt(1, 7)
        val suma = dado1 + dado2

        println("Lanzamiento #$contador: Dado 1 = $dado1, Dado 2 = $dado2, Suma = $suma")

        sumaDado1 += dado1
        sumaDado2 += dado2

        contador++
    }

    println("\nLa suma total del Dado 1 fue: $sumaDado1")
    println("La suma total del Dado 2 fue: $sumaDado2")

    when {
        sumaDado1 > sumaDado2 -> println("El Dado 1 tuvo el mayor puntaje con $sumaDado1 puntos.")
        sumaDado2 > sumaDado1 -> println("El Dado 2 tuvo el mayor puntaje con $sumaDado2 puntos.")
        else -> println("Ambos dados tuvieron el mismo puntaje con $sumaDado1 puntos.")
    }


}