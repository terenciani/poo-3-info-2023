package br.edu.ifpr.abstrata;

public class Gerente  extends Funcionario{
	private double bonificacao = 200;
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculaSalario() {
		double salario = this.getSalario() + this.bonificacao;
		this.setSalario(salario);
		
	}
	
}
