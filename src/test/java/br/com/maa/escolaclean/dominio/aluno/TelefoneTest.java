package br.com.maa.escolaclean.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TelefoneTest {

	@Test
	void naoDeveriaCriarTelefonesComNumeroInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone("", ""));

		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));

		assertThrows(IllegalArgumentException.class, () -> new Telefone("dd", ""));
	}
	
	@Test
	void deveriaCriarTelefonesComNumeroValido() {
	
		assertDoesNotThrow(() -> new Telefone("19","12345678"));
		

		assertDoesNotThrow(() -> new Telefone("19","123456789"));
	}


}
