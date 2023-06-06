package br.edu.ifpr.teste;

public class TesteSoma{
	public static void main(String[] args){
//		System.out.println(somar(1, 2));
//		System.out.println(somar("1", "2"));
//		System.out.println(somar(1, 2, 3, 4, 5));
//		int vetorInteiro[] = {1, 2, 3};
//		double vetorDouble[] = {1.5, 2.5, 3.5};
//		double resultado[] = somar(vetorInteiro, vetorDouble);		
//		for(int i = 0; i < resultado.length; i++){
//			System.out.println(resultado[i]);
//		}
		char[] x = {'a','b','c'};
		System.out.println(somar(x));
		System.out.println((int)somar(x));
		
		
	}

	public static char somar(char[] x) {
		char total = 0;
		for (char c: x) {
			total += c;
		}
		return total;
	}
	
	public static int somar(int x, int y){
		int soma = x + y;
		return soma;
	}
	public static int somar(String x, String y){
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);

		int soma = a + b;
		return soma;
	}
	public static int somar(int ... numeros){
		int soma = 0;
		for(int i = 0; i < numeros.length; i++){
			soma = soma + numeros[i];
		}
		return soma;
	}
	public static double[] somar(int x[], double y[]){
		if(x.length != y.length){
			System.out.println("Impossível somar");
			return new double[0];
		} else {
			double resultado[] = new double[x.length];
			for(int i = 0; i < x.length; i++){
				resultado[i] = x[i] + y[i];
			}
			return resultado;
		}
	}
	
} 
