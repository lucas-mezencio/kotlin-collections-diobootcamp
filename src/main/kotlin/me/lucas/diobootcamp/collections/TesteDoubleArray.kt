package me.lucas.diobootcamp.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1100.0
    salarios[1] = 5400.0
    salarios[2] = 3300.0

    salarios.forEach { println(it) }

    printSection()
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach(::println)

    printSection()
    val salarios2 = doubleArrayOf(1600.0, 3000.0, 500.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}