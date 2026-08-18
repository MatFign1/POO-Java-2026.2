package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		String nome;
		double n1, n2, media, notafinal, mediafinal = 0;
		String situacao = "";
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Digite seu nome: ");
		nome = "Matheus";
		
		System.out.println("Digite sua nota 01: ");
		n1 = sc.nextDouble();
		System.out.println("Digite sua nota 02: ");
		n2 = sc.nextDouble();
		
		media =  (n1 + n2)/2;
		
		if (media >= 6) {
			situacao = "Aprovado!";
		}
		
		else {
			if (media >= 3) {
				situacao = "Recuperação";
				System.out.println("Situação: " + situacao);
				
				System.out.println("Digite a Nota Final: ");
				notafinal = sc.nextDouble();
				mediafinal = (notafinal + media)/2;
				
				if (mediafinal >= 5) {
					situacao = "Aprovado!!!";
					System.out.println("Situação: " + situacao);
				}
				else {
					situacao = "Reprovado !!!";
					System.out.println("Situação: " + situacao);
				}
			}
			else {
				situacao = "huauauauaua";
				System.out.println("Situação: " + situacao);
			}
		}
		
		System.out.println("Nome: " + nome);
		System.out.println("Média: " + media);
		System.out.println("Média Final: " + mediafinal);
		System.out.println("Situação: " + situacao);

	}
}