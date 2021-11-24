class SchoolManager(
    var listaCodigoAlunos: MutableList<Int> = mutableListOf(),
    var listaCodigoProfessores: MutableList<Int> = mutableListOf(),
    var listaCodigoCursos: MutableList<Int> = mutableListOf(),
    var listaMatricula: MutableList<Matricula> = mutableListOf()
) {
    var listaTotalCurso: MutableList<Curso> = mutableListOf()
    var listaTotalProfessoresAdjuntos: MutableList<ProfessorAdjunto> = mutableListOf()
    var listaTotalProfessoresTitulares: MutableList<ProfessorTitular> = mutableListOf()

    fun registrarCurso(
        nomeCurso: String,
        codigoDoCurso: Int,
        maxAlunos: Int
    ) {
        if (listaCodigoCursos.contains(codigoDoCurso)) {
            println("O curso já está registrado")
        } else {
            val novoCurso = Curso(
                nomeCurso,
                codigoDoCurso,
                professorTitular = null,
                professorAdjunto = null,
                maxAlunos
            )
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

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        quantidadeDeHoras: Int
    ) {
        if (listaCodigoProfessores.contains(codigoProfessor)) {
            println("O professor já está registrado")
        } else {
            val novoProfessorAdjunto =
                ProfessorAdjunto(quantidadeDeHoras, nome, sobrenome, 0, codigoProfessor)
            listaCodigoProfessores.add(novoProfessorAdjunto.codigoProfessor)
            listaTotalProfessoresAdjuntos.add(novoProfessorAdjunto)
            println("O professor foi registrado com sucesso!")
        }
    }

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        especialidade: String
    ) {
        if (listaCodigoProfessores.contains(codigoProfessor)) {
            println("O professor já está registrado")
        } else {
            val novoProfessorTitular =
                ProfessorTitular(especialidade, nome, sobrenome, 0, codigoProfessor)
            listaCodigoProfessores.add(novoProfessorTitular.codigoProfessor)
            listaTotalProfessoresTitulares.add(novoProfessorTitular)
            println("O professor foi registrado com sucesso!")
        }
    }

    fun excluirProfessor(codigoProfessor: Int) {
        if (listaCodigoProfessores.contains(codigoProfessor)) {
            listaCodigoProfessores.remove(codigoProfessor)

            for (item in listaTotalProfessoresTitulares) {
                if (item.codigoProfessor == codigoProfessor) {
                    listaTotalProfessoresTitulares.remove(item)
                    break
                }
            }
            for (item in listaTotalProfessoresAdjuntos) {
                if (item.codigoProfessor == codigoProfessor) {
                    listaTotalProfessoresAdjuntos.remove(item)
                    break
                }
            }
            println("O professor foi excluído da lista de professores")
        } else {
            println("O professor não faz parte do quadro de professores!")
        }
    }
}