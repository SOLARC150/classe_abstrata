package br.com.carlos;

import java.util.HashSet;
import java.util.Set;

public abstract class Pessoa {

	protected String nome;
	
	protected int idade;
	
	protected int nascimento;
	
	protected String codigoRegistro;
	
	protected Set<PessoaFisica> responsavel;
	
	public Pessoa (String nome, int idade, int data, String registro, HashSet responsavel) {
		
		this.nome = nome;
		this.idade = idade;
		this.nascimento = data;
		this.codigoRegistro = registro;
		this.responsavel = responsavel;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public int getNascimento() {
		return nascimento;
	}

	public String getCodigoRegistro() {
		return codigoRegistro;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}

	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}
	
}
