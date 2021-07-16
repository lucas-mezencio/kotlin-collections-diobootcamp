package me.lucas.diobootcamp.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach(::println)

    printSection()
    println(funcionarios.find{ it.nome == "Maria" })

    printSection()
    funcionarios
        .sortedBy { it.salario }
        .forEach(::println)

    printSection()
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach(::println)


}
