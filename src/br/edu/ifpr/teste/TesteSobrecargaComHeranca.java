package br.edu.ifpr.teste;

import br.edu.ifpr.sobrecarga.MinhaSubclasse;
import br.edu.ifpr.sobrecarga.Subclasse;
import br.edu.ifpr.sobrecarga.Superclasse;

public class TesteSobrecargaComHeranca {
	public static void main(String[] args) {
		/*MinhaSubclasse s = new MinhaSubclasse();
		Superclasse s3 = new Superclasse();
		s3.metodo("Teste");
		Subclasse s2 = new Subclasse();
		s.metodo("Teste");
		s.metodo("Teste");
		s2.metodo(); */
		
		
		// TypeCast
		Subclasse m2 = new MinhaSubclasse();
		// m2.metodo("Minha subclasse");
		m2.metodo();
		
	}
}
