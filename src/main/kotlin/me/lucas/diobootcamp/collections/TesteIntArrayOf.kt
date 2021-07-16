package me.lucas.diobootcamp.collections

import me.lucas.diobootcamp.collections.utils.PrintSection


fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach {
        println(it)
    }

    PrintSection.section()
    values.sort()
    values.forEach {
        println(it)
    }
}