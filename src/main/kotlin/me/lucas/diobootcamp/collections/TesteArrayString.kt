package me.lucas.diobootcamp.collections

fun main() {
    val nomes = Array<String>(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Ziraldo"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    printSection()
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    printSection()
    val nomes2 = arrayOf("Maria", "Jonas", "Amanda")
    nomes2.sort()
    nomes2.forEach { println(it) }
}

