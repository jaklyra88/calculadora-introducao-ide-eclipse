package br.com.jaklyra;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		//CRIANDO VARI�VEL E A FUN��O QUE SER� ATRIBU�DA A ELA ( A VARIEVEL RECEBE O RETORNA DESTA FUN��O) 
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println("\nResultados : \n");
		System.out.println("Soma : " + soma);
		System.out.println("Subtra��o : " + subtracao);
		System.out.println("Multiplica��o : " + multiplicacao);
		System.out.println("Divis�o : " + divisao);
		

	}

	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static float divisao(int a, int b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
}
