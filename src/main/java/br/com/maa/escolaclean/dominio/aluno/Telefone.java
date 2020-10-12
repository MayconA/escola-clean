package br.com.maa.escolaclean.dominio.aluno;

public class Telefone {

	private String ddd;
	private String numero;

	public Telefone(String ddd, String numero) {
		
		if (ddd == null || numero == null) {
			throw new IllegalArgumentException("DDD e n�mero s�o obrigat�rios");
		}
		

		if (!ddd.matches("\\d{2}")) {
			throw new IllegalArgumentException("DDD � inv�lido");
		}
		
		if (!numero.matches("\\d{8}|\\d{9}")) {
			throw new IllegalArgumentException("numero � inv�lido");
		}

		this.ddd = ddd;
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public String getDdd() {
		return ddd;
	}

}
