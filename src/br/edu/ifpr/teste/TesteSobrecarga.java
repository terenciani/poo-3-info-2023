package br.edu.ifpr.teste;

public class TesteSobrecarga {

	public static void main(String[] args, int x) {
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		System.out.println("1");
		TesteSobrecarga.main(args, 2);
	}
	
	

}
