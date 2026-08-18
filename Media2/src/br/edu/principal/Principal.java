package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		String nome;
		double n1, n2, media;
		String situacao = "";
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Digite seu nome: ");
		//nome = sc.next();
		
		nome = "Fulano";
		System.out.println("Digite sua nota 01: ");
		n1 = sc.nextDouble();
		System.out.println("Digite sua nota 02: ");
		n2 = sc.nextDouble();
		
		media =  (n1 + n2)/2;
		
		if (media >= 6) {
			situacao = "Aprovado";
		}

		else {
			situacao = "Reprovado";
		}
		
		System.out.println("Nome: " + nome);
		System.out.println("Média: " + media);
		System.out.println("Situação " + situacao);		
		
	}
}