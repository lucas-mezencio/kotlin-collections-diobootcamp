package me.lucas.diobootcamp.collections

import me.lucas.diobootcamp.collections.utils.PrintSection

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    println("List:\n")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach(::println)

    PrintSection.section()
    funcionarios.add(pedro)
    funcionarios.forEach(::println)

    PrintSection.section()
    funcionarios.remove(joao)
    funcionarios.forEach(::println)

    PrintSection.section()
    println("Set:\n")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach(::println)

    PrintSection.section()
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach(::println)

    PrintSection.section()
    funcionarioSet.remove(joao)
    funcionarioSet.forEach(::println)

}