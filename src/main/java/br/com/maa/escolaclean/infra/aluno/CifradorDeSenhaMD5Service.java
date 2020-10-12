package br.com.maa.escolaclean.infra.aluno;

import br.com.maa.escolaclean.dominio.aluno.CifradorDeSenhaService;

public class CifradorDeSenhaMD5Service implements CifradorDeSenhaService {

	@Override
	public String cifrarSenha(String senha) {
		
		return null;
	}

	@Override
	public boolean isSenhaValida(String senhaCifrada, String senha) {
	
		return senhaCifrada.equals(cifrarSenha(senha));
	}

}
