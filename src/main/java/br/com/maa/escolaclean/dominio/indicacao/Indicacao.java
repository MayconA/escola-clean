package  br.com.maa.escolaclean.dominio.indicacao;

import java.time.LocalDateTime;

import br.com.maa.escolaclean.dominio.aluno.Aluno;

public class Indicacao {

	private Aluno Indicado;
	private Aluno Indicante;
	private LocalDateTime dataIndicacao;

	public Indicacao(Aluno indicado, Aluno indicante) {

		Indicado = indicado;
		Indicante = indicante;
		dataIndicacao = LocalDateTime.now();
	}

	public Aluno getIndicado() {
		return Indicado;
	}

	public Aluno getIndicante() {
		return Indicante;
	}

	public LocalDateTime getDataIndicacao() {
		return dataIndicacao;
	}

}
