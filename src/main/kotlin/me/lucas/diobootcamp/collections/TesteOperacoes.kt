package me.lucas.diobootcamp.collections

import me.lucas.diobootcamp.collections.utils.PrintSection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    PrintSection.section()
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salário: ${salarios.average()}")

    PrintSection.section()
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach{ println(it) }

    PrintSection.section()
    println(salarios.count { it in 2000.00..5000.0 })

    PrintSection.section()
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it != 2250.0 })
    println(salarios.find { it == 500.0 })

    PrintSection.section()
    println(salarios.any { it != 2250.0 })
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })


    PrintSection.section()
    val arrElemIguais = intArrayOf(1, 1, 1, 1)
    println(arrElemIguais.maxOrNull())
}