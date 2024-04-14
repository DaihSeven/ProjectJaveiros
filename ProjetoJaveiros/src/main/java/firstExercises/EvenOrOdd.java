package firstExercises;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Por favor, digite um número ou 'sair' para terminar:");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                int number = Integer.parseInt(userInput);
                if (number % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            } catch (NumberFormatException e) {
                System.out.println("A entrada fornecida não é um número válido.");
            }
        }
    }
}
/**
 * 1) Desafio: Verificar se o número é par ou ímpar
 * Scanner: usado para leitura de entrada;
 * While: cria um loop para que a pergunta continue sendo impressa até digitar sair;
 * if-else: para as condições;
 * Try/Catch: para tratamento de exceção caso a entrada não seja válida, ou seja um número;
 * É usado a operação matemática de resto(number % 2 == 0) para determinar se é par(even) ou ímpar(odd);
 *
 * 13/04/2024
 */