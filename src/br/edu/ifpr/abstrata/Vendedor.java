package br.edu.ifpr.abstrata;

public class Vendedor  extends Funcionario{

	public Vendedor() {
		super();
	}

	public Vendedor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void calculaSalario() {
		double salario = this.getSalario() 
				+ (this.getSalario() * 0.1);
		
		this.setSalario(salario);
		
	}
	
}
