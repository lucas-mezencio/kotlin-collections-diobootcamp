package me.lucas.diobootcamp.collections


data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContrato: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $${String.format("%.2f", salario)}
        """.trimIndent()
}