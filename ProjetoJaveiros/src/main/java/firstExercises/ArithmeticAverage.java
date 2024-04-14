package firstExercises;

import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Por favor, digite três números ou 'sair' para terminar:");
            String userInput1 = scanner.nextLine();
            String userInput2 = scanner.nextLine();
            String userInput3 = scanner.nextLine();

            if (userInput1.equalsIgnoreCase("sair") || userInput2.equalsIgnoreCase("sair") || userInput3.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                int number1 = Integer.parseInt(userInput1);
                int number2 = Integer.parseInt(userInput2);
                int number3 = Integer.parseInt(userInput3);
                double average = (number1 + number2 + number3) / 3.0;
                System.out.println("A média aritmética é: " + average);
            } catch (NumberFormatException e) {
                System.out.println("Uma ou mais das entradas fornecidas não são números válidos.");
            }
        }
    }
}
/**
 * 4) Desafio: Média aritmética;
 * Scanner: usado para leitura de entrada, no caso pede três entradas;
 * While: cria um loop para que a pergunta continue sendo impressa até digitar sair;
 * if-else: para as condições;
 * Try/Catch: para tratamento de exceção caso a entrada não seja válida, ou seja um número;
 * É usado a operação matemática (number1 + number2 + number3) / 3.0 para realizar o cálculo da mèdia;
 *
 * 13/04/2024
 */