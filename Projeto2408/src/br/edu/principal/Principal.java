package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		// Variáveis e Comandos usados nesse código.
		Scanner sc = new Scanner(System.in);
		String nome = "";
		String celular = "";
		String email = "";
		boolean continuar = true;
		
		//Print - introdução (menu).
		System.out.println("Agenda de Contatos - 24 / 08 / 2026");
		System.out.println("Bem-vindo!!!");
		
		while (continuar) {
			
			//Print - opções escolhidas pelo usuário.
			System.out.println();
			System.out.println("==== Menu ====");
			System.out.println("1 - Adicionar contato");
			System.out.println("2 - Listar contato");
			System.out.println("3 - Procurar contato");
			System.out.println("4 - Excluir contato");
			System.out.println("5 - Sair");
			System.out.println();
			
			// Print - escolha do usuário.
			System.out.print("Escolha uma opção: ");
			int opcao = sc.nextInt();
			sc.nextLine();
			
	
			//Parecido com while/for (Casos).
			switch(opcao) {
				case 1 -> {
					System.out.println("Adicionar contato");
					
					System.out.println("Digite o nome: ");
					nome = sc.nextLine();
					
					System.out.println("Digite o celular: ");
					celular = sc.nextLine();
		
					System.out.println("Digite o email: ");
					email = sc.nextLine();
					
					System.out.println("Contato salvo com sucesso!");
				}
				case 2 -> {
					System.out.println("Listar conteúdo");
				}	
				case 3 -> {
					System.out.println("Procurar contato");
				}
				case 4 ->{
					System.out.println("Excluir contato");
				}
				case 5 -> {
					System.out.println("Saindo...");
					continuar = false;
				}
				default-> //Else.
					System.out.println("Opção inválida");
				
				}
		}
	}
}
