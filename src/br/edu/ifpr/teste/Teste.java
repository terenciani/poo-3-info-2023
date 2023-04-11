package br.edu.ifpr.teste;

import br.edu.ifpr.encapsulamento.Pessoa;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		//pessoa.nome = "Kiria";
		pessoa.setNome("Kiria a lenda");
		pessoa.setIdade(16);
		pessoa.setMae("");
		
		//System.out.println(pessoa.nome);
		System.out.println(pessoa.getNome());
	}

}
