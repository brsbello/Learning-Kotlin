class SchoolManager(
    var listaCodigoAlunos: MutableList<Int> = mutableListOf(),
    var listaCodigoProfessores: MutableList<Int> = mutableListOf(),
    var listaCodigoCursos: MutableList<Int> = mutableListOf(),
    var listaMatricula: MutableList<Matricula> = mutableListOf()
)