package br.com.maa.escolaclean.dominio.aluno;


//Value Object
public class Email {

	private String email;

	public Email(String email) {
		if (email == null || !email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("E-mail com formato inválido");

		}

		this.email = email;
	}

	public String getEndereco() {
		return email;
	}
}
