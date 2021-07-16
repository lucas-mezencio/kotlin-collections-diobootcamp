package me.lucas.diobootcamp.collections

import me.lucas.diobootcamp.collections.utils.PrintSection

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach(::println)

    PrintSection.section()
    println(funcionarios.find{ it.nome == "Maria" })

    PrintSection.section()
    funcionarios
        .sortedBy { it.salario }
        .forEach(::println)

    PrintSection.section()
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach(::println)


}
