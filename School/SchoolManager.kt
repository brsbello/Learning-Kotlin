class SchoolManager(
    var listaCodigoAlunos: MutableList<Int> = mutableListOf(),
    var listaCodigoProfessores: MutableList<Int> = mutableListOf(),
    var listaCodigoCursos: MutableList<Int> = mutableListOf(),
    var listaMatricula: MutableList<Matricula> = mutableListOf()
) {
    var listaTotalCurso: MutableList<Curso> = mutableListOf()

    fun registrarCurso(
        nomeCurso: String,
        codigoDoCurso: Int,
        maxAlunos: Int
    ) {
        if (listaCodigoCursos.contains(codigoDoCurso)) {
            println("O curso já está registrado")
        } else {
            val novoCurso = Curso(nomeCurso, codigoDoCurso, professorTitular = null, professorAdjunto = null, maxAlunos)
            listaCodigoCursos.add(novoCurso.codigoDoCurso)
            listaTotalCurso.add(novoCurso)
            println("O curso foi registrado com sucesso")
        }
    }

    fun excluirCurso(codigoDoCurso: Int) {
        if (listaCodigoCursos.contains(codigoDoCurso)) {
            listaCodigoCursos.remove(codigoDoCurso)
            for (item in listaTotalCurso) {
                if (item.codigoDoCurso == codigoDoCurso) {
                    listaTotalCurso.remove(item)
                }
                break
            }
            println("O curso foi excluído da lista de cursos disponíveis")
        } else {
            println("O curso não está registrado!")
        }
    }
}