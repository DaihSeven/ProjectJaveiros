package firstExercises;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Por favor, digite uma temperatura em Celsius ou 'sair' para terminar:");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                double degrees = Double.parseDouble(userInput);
                System.out.printf("%.1f%n", degrees * 9/5 + 32);
            } catch (NumberFormatException e) {
                System.out.println("A entrada fornecida não é um número válido.");
            }
        }
    }
}
/**
 * 2) Desafio: Converter temperatura;
 * Scanner: usado para leitura de entrada;
 * While: cria um loop para que a pergunta continue sendo impressa até digitar sair;
 * if-else: para as condições;
 * Try/Catch: para tratamento de exceção caso a entrada não seja válida, ou seja um número;
 * É usado a operação matemática de "%.1f%n", degrees * 9/5 + 32 para realizar a conversão;
 *
 * 13/04/2024
 */