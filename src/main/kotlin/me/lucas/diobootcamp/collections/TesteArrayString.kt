package me.lucas.diobootcamp.collections

import me.lucas.diobootcamp.collections.utils.PrintSection

fun main() {
    val nomes = Array<String>(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Ziraldo"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    PrintSection.section()
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    PrintSection.section()
    val nomes2 = arrayOf("Maria", "Jonas", "Amanda")
    nomes2.sort()
    nomes2.forEach { println(it) }
}

