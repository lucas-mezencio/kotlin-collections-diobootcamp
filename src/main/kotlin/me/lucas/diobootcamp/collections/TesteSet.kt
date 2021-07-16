package me.lucas.diobootcamp.collections

import me.lucas.diobootcamp.collections.utils.PrintSection

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)
    val funcionarios3 = setOf(joao, pedro, maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach(::println)

    PrintSection.section()
    val resultSubtract = funcionarios3.subtract(funcionarios1)
    resultSubtract.forEach(::println)

    PrintSection.section()
    val resultIntersect = funcionarios1.intersect(funcionarios3)
    resultIntersect.forEach(::println)
    println("Teste intersecção vazia: ${funcionarios1.intersect(funcionarios2)}")

}