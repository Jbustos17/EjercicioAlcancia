
fun main() {

    var monedas20 = 0
    var monedas50 = 0
    var monedas100 = 0
    var monedas200 = 0
    var monedas500 = 0

    var opcion: Int
    var continuar = true


    while (continuar) {
        println("\n--- Menú de la Alcancía ---")
        println("1. Agregar moneda")
        println("2. Contar monedas por denominación")
        println("3. Calcular total ahorrado")
        println("4. Romper la alcancía")
        print("Seleccione una opción: ")


        val input = readLine()
        if (input.isNullOrBlank() || input.toIntOrNull() == null) {
            println("Entrada no válida. Por favor ingrese un número del 1 al 5.")
            continue
        } else {
            opcion = input.toInt()
        }

        when (opcion) {
            1 -> {
                println("INGRESE LA DENOMINACION DE LA MONEDA (20, 50, 100, 200, 500): ")
                val denominacionInput = readLine()
                val denominacion = denominacionInput?.toIntOrNull() ?: 0
                when (denominacion) {
                    20 -> monedas20++
                    50 -> monedas50++
                    100 -> monedas100++
                    200 -> monedas200++
                    500 -> monedas500++
                    else -> println("Denominación no válida.")
                }
            }

            2 -> {
                println("\nCANTIDAD DE MONEDAS POR DENOMINACION:")
                println("$20: $monedas20")
                println("$50: $monedas50")
                println("$100: $monedas100")
                println("$200: $monedas200")
                println("$500: $monedas500")
            }

            3 -> {
                val total =
                    (monedas20 * 20) + (monedas50 * 50) + (monedas100 * 100) + (monedas200 * 200) + (monedas500 * 500)
                println("TOTAL AHORRADO: $$total")
            }

            4 -> {
                val total =
                    (monedas20 * 20) + (monedas50 * 50) + (monedas100 * 100) + (monedas200 * 200) + (monedas500 * 500)
                println("\nROMPIENDO LA ALCANCIA...")
                println("CANTIDAD DE MONEDAS POR DENOMINACION:")
                println("$20: $monedas20")
                println("$50: $monedas50")
                println("$100: $monedas100")
                println("$200: $monedas200")
                println("$500: $monedas500")
                println("TOTAL AHORRADO: $$total")

                monedas20 = 0
                monedas50 = 0
                monedas100 = 0
                monedas200 = 0
                monedas500 = 0
                println("LA ALCANCIA HA SIDO VACIADA.")
            }
        }
    }
}