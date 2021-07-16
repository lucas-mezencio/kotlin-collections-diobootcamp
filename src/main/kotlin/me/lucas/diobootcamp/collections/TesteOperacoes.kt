package me.lucas.diobootcamp.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    printSection()
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salário: ${salarios.average()}")

    printSection()
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach{ println(it) }

    printSection()
    println(salarios.count { it in 2000.00..5000.0 })

    printSection()
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it != 2250.0 })
    println(salarios.find { it == 500.0 })

    printSection()
    println(salarios.any { it != 2250.0 })
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })


    printSection()
    val arrElemIguais = intArrayOf(1, 1, 1, 1)
    println(arrElemIguais.maxOrNull())
}