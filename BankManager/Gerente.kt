class Gerente(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double {
        return salario * 0.2
    }

    fun autentica(senha: Int) {
        if (this.senha == senha) {
            return true
        } else {
            return false
        }
    }

}