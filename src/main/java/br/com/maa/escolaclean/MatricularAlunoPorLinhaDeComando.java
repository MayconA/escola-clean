package br.com.maa.escolaclean;

import br.com.maa.escolaclean.aplicacao.aluno.matricula.MatriculaAluno;
import br.com.maa.escolaclean.aplicacao.aluno.matricula.MatriculaAlunoDto;
import br.com.maa.escolaclean.infra.aluno.AlunoRepositoryMemory;

public class MatricularAlunoPorLinhaDeComando {

	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";

		MatriculaAluno matricular = new MatriculaAluno(new AlunoRepositoryMemory());
		matricular.executa(new MatriculaAlunoDto(nome, cpf, email));
	}

}
