package Projeto_controle;

	import java.util.Scanner;	
	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Supervisora supervisora = new Supervisora("Janiele", 28, "Supervisora");

	        while (true) {
	            System.out.println("\nMenu Principal:");
	            System.out.println("1 - Adicionar Colaborador");
	            System.out.println("2 - Remover Colaborador");
	            System.out.println("3 - Visualizar Colaboradores");
	            System.out.println("4 - Adicionar Produto");
	            System.out.println("5 - Remover Produto");
	            System.out.println("6 - Visualizar Produtos");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            int opcao = scanner.nextInt();
	           

	            switch (opcao) {
	                case 1:
	                    System.out.println("Nome do Colaborador: ");
	                    String nome = scanner.next();
	                    System.out.println("Idade do Colaborador: ");
	                    int idade = scanner.nextInt();
	                    scanner.nextLine();
	                  
	                    System.out.print("Profissão do Colaborador: ");
	                    String profissao = scanner.nextLine();
	                    Colaborador colaborador = new Colaborador(nome, idade, profissao);
	                    supervisora.adicionarColaborador(colaborador);
	                    break;

	               // case 2:
	                  // System.out.print("Nome do Colaborador a remover: ");
	                 //  String nomeRemover = scanner.nextLine();
	                 //  supervisora.removerColaborador(nomeRemover);
	                 //  break;

	                case 3:
	                    supervisora.visualizarColaboradores();
	                    break;

	                case 4:
	                    System.out.print("Nome do Produto: ");
	                    String produtoNome = scanner.nextLine();
	                    System.out.print("Quantidade do Produto: ");
	                    int quantidade = scanner.nextInt();
	                  
	                    ProdutoDeLimpeza produto = new ProdutoDeLimpeza(produtoNome, quantidade);
	                    supervisora.getEquipe().adicionarProduto(produto);
	                    break;

	                case 5:
	                    System.out.print("Nome do Produto a remover: ");
	                    String nomeProdutoRemover = scanner.nextLine();
	                    supervisora.getEquipe().removerProduto(nomeProdutoRemover);
	                    break;

	                case 6:
	                    supervisora.getEquipe().mostrarProdutos();
	                    break;

	                case 0:
	                    System.out.println("Encerrando o sistema...");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	            
	        }
	    }
	}
