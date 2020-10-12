package br.com.maa.escolaclean.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.maa.escolaclean.dominio.aluno.Aluno;
import br.com.maa.escolaclean.dominio.aluno.AlunoNaoEncontrado;
import br.com.maa.escolaclean.dominio.aluno.AlunoRepository;
import br.com.maa.escolaclean.dominio.aluno.Cpf;

public class AlunoRepositoryMemory implements AlunoRepository {

	private List<Aluno> matriculados = new ArrayList<>();

	@Override
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno getAlunoByCpf(Cpf cpf) {
		return this.matriculados.stream()
				.filter(a -> a.getCpf().equals(cpf.getNumero()))
				.findFirst()
				.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> getAllAlunos() {
		return this.matriculados;
	}

}
