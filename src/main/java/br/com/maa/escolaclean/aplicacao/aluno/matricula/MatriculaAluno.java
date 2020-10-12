package br.com.maa.escolaclean.aplicacao.aluno.matricula;

import br.com.maa.escolaclean.dominio.aluno.Aluno;
import br.com.maa.escolaclean.dominio.aluno.AlunoRepository;

public class MatriculaAluno {

	private final AlunoRepository repositorio;

	public MatriculaAluno(AlunoRepository repositorio) {
		this.repositorio = repositorio;
	}

	// COMMAND
	public void executa(MatriculaAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
	}

}
