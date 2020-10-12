package br.com.maa.escolaclean.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecoInvalido() {

		assertThrows(IllegalArgumentException.class, () -> new Email(""));

		assertThrows(IllegalArgumentException.class, () -> new Email(null));

		assertThrows(IllegalArgumentException.class, () -> new Email("ddd"));

	}
	
	@Test
	void deveriaCriarEmailsComEnderecoValido() {
	
		assertDoesNotThrow(() -> new Email("maycon@bol.com.br"));
	}

}
