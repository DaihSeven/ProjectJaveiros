package firstExercises;

import java.util.Scanner;

public class CheckPrimeNumber {
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
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(number + " é um número primo");
                } else {
                    System.out.println(number + " não é um número primo");
                }
            } catch (NumberFormatException e) {
                System.out.println("A entrada fornecida não é um número válido.");
            }
        }
    }
}
/**
 * 3) Desafio: Verificar se o número é primo;
 * Scanner: usado para leitura de entrada;
 * While: cria um loop para que a pergunta continue sendo impressa até digitar sair;
 * if-else: para as condições;
 * Try/Catch: para tratamento de exceção caso a entrada não seja válida, ou seja um número;
 * É usado a: for (int i = 2; i <= Math.sqrt(number); i++) {
 *                     if (number % i == 0){} para realizar a verificação;
 *
 * 13/04/2024
 */