class ProfessorTitular(
    val especialidade: String,
    nome: String,
    sobrenome: String,
    tempoDeCasa: Long,
    codigoProfessor: Int
) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor)
