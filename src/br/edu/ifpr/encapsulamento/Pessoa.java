package br.edu.ifpr.encapsulamento;

public class Pessoa {
	private String nome;
	private int idade;
	private String pai;
	private String mae;

	public Pessoa() {

	}

	public Pessoa(String nome, int idade, String pai, String mae) {
		this.nome = nome;
		this.idade = idade;
		this.pai = pai;
		this.mae = mae;	
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public String getPai() {
		return this.pai;
	}
	public String getMae() {
		return this.mae;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
}
