package br.com.maa.escolaclean.dominio.aluno;

public interface CifradorDeSenhaService {
	
	String cifrarSenha(String senha);
	
	boolean isSenhaValida(String senhaCifrada, String senha);

}
