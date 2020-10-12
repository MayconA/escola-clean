package br.com.maa.escolaclean.dominio.aluno;

public class AlunoFactory {

	private Aluno aluno;

	public Aluno criar() {
		return this.aluno;
	}

	public AlunoFactory comNomeCpfEmail(String nome, String cpf, String email) {

		aluno = new Aluno(new Cpf(cpf), nome, new Email(email));

		return this;

	}

	public AlunoFactory comTelefone(String DDD, String numero) {
		this.aluno.addTelefone(DDD, numero);

		return this;
	}

}
