package br.com.maa.escolaclean.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CpfTest {

	@Test
	void naoDeveriaCriarCpfsComNumeroInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Cpf(""));

		assertThrows(IllegalArgumentException.class, () -> new Cpf(null));

		assertThrows(IllegalArgumentException.class, () -> new Cpf("123"));
	}
	
	@Test
	void deveriaCriarCpfsComNumeroValido() {
	
		assertDoesNotThrow(() -> new Cpf("123.456.789-01"));
		

	}
}
