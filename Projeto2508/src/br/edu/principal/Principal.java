package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		String nome = "";
        String celular = "";
        String email = "";
        Scanner sc = new Scanner(System.in); 
        int opcao;
        boolean continuar = true;
        
		System.out.println("==========================");
        System.out.println("     AGENDA DE CONTATOS    ");
        System.out.println("          v0.0.0           ");
        System.out.println("==========================");
        System.out.println("Bem-vindo!");
        
        while(continuar) {
        	System.out.println();
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contato");
            System.out.println("3 - Procurar contato");
            System.out.println("4 - Excluir contato");
            System.out.println("5 - Sair");
            System.out.println();

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao) {
    	        case 1 -> {
    	        	System.out.println("\n--- ADICIONAR CONTATO ---");

    	            System.out.print("Nome: ");
    	            nome = sc.nextLine();

    	            System.out.print("Celular: ");
    	            celular = sc.nextLine();

    	            System.out.print("E-mail: ");
    	            email = sc.nextLine();

    	            System.out.println("Contato salvo com sucesso!");
    	        }
    	        case 2 ->{
    	            System.out.println("Listar contato");
    	            if(nome.isEmpty()) {
    	            	System.out.println("Nenhum contato encontrado!");
    	            }
    	            else {
    	            	System.out.println("\n--- CONTATO CADASTRADO ---");
    	                System.out.println("Nome: " + nome);
    	                System.out.println("Celular: " + celular);
    	                System.out.println("E-mail: " + email);
    	            }
    	        }
    	        case 3 -> {
    	        	System.out.println("Procurar contato");
    	        	System.out.print("Digite o nome que deseja procurar: ");
                    String nomeBusca = sc.nextLine();
                    
                    if(nome.equalsIgnoreCase(nomeBusca)) {
                    	 System.out.println("Contato encontrado!");
                         System.out.println("Nome: " + nome);
                         System.out.println("Celular: " + celular);
                         System.out.println("E-mail: " + email);
                    }
                    else{
                    	System.out.println("Contato não encontrado.");
                    }
    	        }
    	        case 4 -> {
    	        	System.out.println("\n--- EXCLUIR CONTATO ---");
                    if (nome.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        nome = "";
                        celular = "";
                        email = "";
                        System.out.println("Contato excluído com sucesso!");
                    }
    	        }
    	        case 5 -> {
    	            System.out.println("Saindo...");
    	            continuar = false;
    	        }
    	        default ->  System.out.println("Opção inválida!");
    	    }//switch
        }//while
	}//main
}//principal