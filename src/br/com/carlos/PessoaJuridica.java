package br.com.carlos;

import java.util.HashSet;
import java.util.Set;

public class PessoaJuridica extends Pessoa{

	public PessoaJuridica(String nome, int idade, int data, String registro, HashSet responsavel) {
		super(nome, idade, data, registro, responsavel);
	}
	
}
