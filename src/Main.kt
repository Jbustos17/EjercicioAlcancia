import kotlin.random.Random

fun main() {

    var CostoCandidato1 = 0.0
    var CostoCandidato2 = 0.0
    var CostoCandidato3 = 0.0
    var VotosCandidato1 = 0
    var VotosCandidato2 = 0
    var VotosCandidato3 = 0

    val CostoInternet =700000
    val CostoTv = 600000
    val CostoRadio = 200000

    while (true) {
    println("1. Votar por el candidato de su elección.")
    println("2. Calcular el costo de campaña de un candidato dependiendo de la influencia publicitaria de cada voto.")
    println("3. Vaciar todas las urnas de la votación.")
    println("4. Conocer el número total de votos.")
    println("5. Porcentaje de votos obtenidos por cada candidato.")
    println("6. Costo promedio de campaña en las elecciones")


        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Ingrese el número del candidato (1, 2 o 3): ")
                val candidato = readLine()?.toIntOrNull()
                print("Ingrese el medio de influencia (1-Internet, 2-Radio, 3-Televisión): ")
                val medio = readLine()?.toIntOrNull()

                if (candidato in 1..3 && medio in 1..3) {
                    when (candidato) {
                        1 -> VotosCandidato1++
                        2 -> VotosCandidato2++
                        3 ->VotosCandidato3++
                    }
                    when (medio) {
                        1 -> when (candidato) {
                            1 -> CostoCandidato1 += CostoInternet
                            2 -> CostoCandidato2 += CostoInternet
                            3 -> CostoCandidato3 += CostoInternet
                        }
                        2 -> when (candidato) {
                            1 -> CostoCandidato1 += CostoRadio
                            2 -> CostoCandidato2 += CostoRadio
                            3 -> CostoCandidato3 += CostoRadio
                        }
                        3 -> when (candidato) {
                            1 -> CostoCandidato1 += CostoTv
                            2 -> CostoCandidato2 += CostoTv
                            3 -> CostoCandidato3 += CostoTv
                        }
                    }
                } else {
                    println("Opcion no valida")
                }
            }
            2 -> {
                print("Ingrese el numero del candidato (1, 2 , 3): ")
                when (readLine()?.toIntOrNull()) {
                    1 -> println("Costo campaña Candidato 1: \$${CostoCandidato1}")
                    2 -> println("Costo campaña Candidato 2: \$${CostoCandidato2}")
                    3 -> println("Costo campaña Candidato 3: \$${CostoCandidato3}")
                    else -> println("Candidato no valido.")
                }
            }
            3 -> {
                VotosCandidato1 = 0
                VotosCandidato2 = 0
                VotosCandidato3 = 0
                CostoCandidato1 = 0.0
                CostoCandidato2 = 0.0
                CostoCandidato3 = 0.0
                println("Urnas vaciadas.")
            }
            4 -> {
                val totalVotos = VotosCandidato1 + VotosCandidato2 + VotosCandidato3
                println("Total de votos: $totalVotos")
            }
            5 -> {
                val totalVotos = VotosCandidato1 + VotosCandidato2 + VotosCandidato3
                if (totalVotos > 0) {
                    println("Candidato 1: ${VotosCandidato1 * 100 / totalVotos}%")
                    println("Candidato 2: ${VotosCandidato2 * 100 / totalVotos}%")
                    println("Candidato 3: ${VotosCandidato3 * 100 / totalVotos}%")
                } else {
                    println("No hay votos registrados.")
                }
            }
            6 -> {
                val totalCosto = CostoCandidato1 + CostoCandidato2 + CostoCandidato3
                val totalVotos = VotosCandidato1 + VotosCandidato2 + VotosCandidato3
                if (totalVotos > 0) {
                    println("Costo promedio de campaña: \$${totalCosto / totalVotos}")
                } else {
                    println("No hay votos registrados.")
                }
            }
            7 -> {
                println("Saliendo del sistema.")
                break
            }
            else -> println("Opcion no valida.")
        }
    }
}






