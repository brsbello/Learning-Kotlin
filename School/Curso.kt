class Curso(
    val nomeDoCurso: String,
    val codigoDoCurso: Int,
    var professorTitular: ProfessorTitular? = null,
    var professorAdjunto: ProfessorAdjunto? = null,
    val maxAlunos: Int,
    var listaAlunos: MutableList<Int?> = mutableListOf()
) {
    open fun matricularAluno(umAluno: Aluno): Boolean {
        var podeAdicionar = false
        if (listaAlunos.size >= maxAlunos) {
            println("Não é possível matricular ${umAluno.nome} no curso de $nomeDoCurso")
            return podeAdicionar
        } else {
            if (listaAlunos.contains(umAluno.codigoAluno)) {
                println("${umAluno.nome} já está matriculado no curso de $nomeDoCurso")
                return podeAdicionar
            } else {
                listaAlunos.add(umAluno.codigoAluno)
                println("${umAluno.nome} foi matriculado no curso de $nomeDoCurso")
                podeAdicionar = true
                return podeAdicionar
            }
        }
    }

    fun desmatricularAluno(umAluno: Aluno) {
        if (listaAlunos.contains(umAluno.codigoAluno)) {
            listaAlunos.remove(umAluno.codigoAluno)
            println("${umAluno.nome} foi desmatriculado do curso de $nomeDoCurso")
        } else {
            println("${umAluno.nome} não está matriculado no curso de $nomeDoCurso")
        }
    }
}