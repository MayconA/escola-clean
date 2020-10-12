package br.com.maa.escolaclean.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

//Entidade
public class Aluno {
	private Cpf cpf;
	private String nome;
	private Email email;
	
	private String senha;

	public Aluno(Cpf cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	private List<Telefone> telefones = new ArrayList<Telefone>();

	public void addTelefone(String ddd, String numero) {
		telefones.add(new Telefone(ddd, numero));
	}

	public String getCpf() {
		return cpf.getNumero();
	}

	public String getNome() {
		return nome;

	}

	public String getEmail() {
		return email.getEndereco();
	}

	public List<Telefone> getTelefones() {
		
		return telefones;
	}

}
