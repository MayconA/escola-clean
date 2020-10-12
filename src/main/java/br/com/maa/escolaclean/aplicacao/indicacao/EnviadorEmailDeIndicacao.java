package br.com.maa.escolaclean.aplicacao.indicacao;

import br.com.maa.escolaclean.dominio.aluno.Aluno;

public interface EnviadorEmailDeIndicacao {
	
	void enviarPara(Aluno indicado);

}
