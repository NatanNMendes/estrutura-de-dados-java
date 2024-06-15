package dataStructure.exercises.array;

import java.util.Scanner;

public class App {
    private final static int SIZE = 3;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SupermarketArray supermarket = new SupermarketArray(SIZE); // Assuming a size of 10 for the array
        int opcao;

        do {
            System.out.println("\nLista de Compras:");
            System.out.println("1 - Inserir");
            System.out.println("2 - Exibir");
            System.out.println("3 - Excluir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (opcao) {
                case 1:
                    System.out.print("Digite o item a ser inserido: ");
                    String item = scanner.nextLine(); // Use nextLine to allow spaces
                    supermarket.add(item);
                    break;
                case 2:
                    supermarket.print();
                    break;
                case 3:
                    System.out.print("Digite o índice do item a ser excluído: ");
                    int index = scanner.nextInt();
                    supermarket.delete(index);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
