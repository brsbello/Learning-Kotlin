class Curso(
    val nomeDoCurso: String,
    val codigoDoCurso: Int,
    var professorTitular: ProfessorTitular? = null,
    var professorAdjunto: ProfessorAdjunto? = null,
    val maxAlunos: Int,
    var listaAlunos: MutableList<Int?> = mutableListOf()
)