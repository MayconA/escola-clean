package br.com.maa.escolaclean.dominio.aluno;

import java.util.List;

public interface AlunoRepository  {

	void matricular(Aluno aluno);

	Aluno getAlunoByCpf(Cpf cpf);

	List<Aluno> getAllAlunos();
}
