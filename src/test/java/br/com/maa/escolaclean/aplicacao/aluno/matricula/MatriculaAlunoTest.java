package br.com.maa.escolaclean.aplicacao.aluno.matricula;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.maa.escolaclean.dominio.aluno.Aluno;
import br.com.maa.escolaclean.dominio.aluno.Cpf;
import br.com.maa.escolaclean.infra.aluno.AlunoRepositoryMemory;

class MatriculaAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		
		AlunoRepositoryMemory repositorio = new AlunoRepositoryMemory();
		MatriculaAluno useCase = new MatriculaAluno(repositorio);
		
		MatriculaAlunoDto dados = new MatriculaAlunoDto(
				"Fulano", 
				"123.456.789-00", 
				"fulano@email.com");
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.getAlunoByCpf(
				new Cpf("123.456.789-00"));
		
		assertEquals("Fulano", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf());
		assertEquals("fulano@email.com", encontrado.getEmail());
	}

}
