package me.lucas.diobootcamp.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 8
    values[2] = 5
    values[3] = 3
    values[4] = 9

    for (value in values) {
        println(value)
    }

    printSection()
    values.forEach {
        println(it)
    }

    printSection()
    values.forEach { valor ->
        println(valor)
    }

    printSection()
    for (index in values.indices) {
        println(values[index])
    }

    printSection()
    values.sort()
    for (value in values) {
        println(value)
    }
}

fun printSection() = println("\n===================================")