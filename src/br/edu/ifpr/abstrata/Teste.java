package br.edu.ifpr.abstrata;

public class Teste {

	public static void main(String[] args) {
		Funcionario vendedor = new Vendedor("Teste Vendedor", 100);
		
		vendedor.calculaSalario();
		vendedor.imprimeDados();
		
		Funcionario gerente = new Gerente("Teste Gerente", 100);
		
		gerente.calculaSalario();
		gerente.imprimeDados();
		
		
		Funcionario influencer = new Influencer("Teste Influencer", 100);
		
		influencer.calculaSalario();
		influencer.imprimeDados();
	}

}
