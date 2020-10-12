package br.com.maa.escolaclean.aplicacao.aluno.matricula;

import br.com.maa.escolaclean.dominio.aluno.Aluno;
import br.com.maa.escolaclean.dominio.aluno.Cpf;
import br.com.maa.escolaclean.dominio.aluno.Email;

public class MatriculaAlunoDto {

	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;
	
	public MatriculaAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}

	public Aluno criarAluno() {
		return new Aluno(
				new Cpf(cpfAluno), 
				nomeAluno, 
				new Email(emailAluno));
	}
	
}
