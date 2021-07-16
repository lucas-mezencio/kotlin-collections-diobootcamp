package me.lucas.diobootcamp.collections

import me.lucas.diobootcamp.collections.utils.PrintSection

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

    PrintSection.section()
    values.forEach {
        println(it)
    }

    PrintSection.section()
    values.forEach { valor ->
        println(valor)
    }

    PrintSection.section()
    for (index in values.indices) {
        println(values[index])
    }

    PrintSection.section()
    values.sort()
    for (value in values) {
        println(value)
    }
}
