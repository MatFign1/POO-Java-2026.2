package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7: ");
		int dia = sc.nextInt(); //Coloca o tipo da variável no Next.
		
		//IF - ELSE/IF
		if (dia == 1) {
			System.out.println("Domingo");
		}
		else if (dia == 2) {
			System.out.println("Segunda");
		}
		else if (dia == 3) {
			System.out.println("Quarta");
		}
		
		//Switch Case
		switch (dia) {
		case 1:
			System.out.println("Domingo");
		case 2:
			System.out.println("Segunda");
		case 3:
			System.out.println("Terça");
		default:
			System.out.println("Esse dia não existe!!");
		}
		
		//Switch Case Moderno
		switch(dia) {
		case 1 -> System.out.println("Domingo");
		case 2 -> System.out.println("Segunda");
		case 3 -> System.out.println("Terça");
		default -> System.out.println("Esse dia não existe!!!");
		
		}
	}

}
