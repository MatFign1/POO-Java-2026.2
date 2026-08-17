package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		char c = 'a';
		short s = 12;
		byte b = 34;
		int i = 1000;
		long l = 1000000000000000001l;
		
		float f = 3.14f;
		double d = 3.112243452525;
		
		String nome;
		double media;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Digite sua media");
		media = sc.nextDouble();
		
		System.out.println("");
		System.out.println("Seu nome é: "+ nome);
		System.out.println("Seu média é: "+ media);
			
	}
}