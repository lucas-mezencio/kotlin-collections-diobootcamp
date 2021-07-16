package me.lucas.diobootcamp.collections

import me.lucas.diobootcamp.collections.utils.PrintSection

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))
    println("Teste el. inex.: ${repositorio.findById("teste")}")

    PrintSection.section()
    repositorio.findAll().forEach(::println)

    PrintSection.section()
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach(::println)
}