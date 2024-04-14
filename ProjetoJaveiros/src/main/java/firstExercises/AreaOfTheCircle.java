package firstExercises;

import java.util.Scanner;

public class AreaOfTheCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Por favor, digite o raio do círculo ou 'sair' para terminar:");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                double radius = Double.parseDouble(userInput);
                double area = Math.PI * radius * radius;
                System.out.println("A área do círculo é: " + area);
            } catch (NumberFormatException e) {
                System.out.println("A entrada fornecida não é um número válido.");
            }
        }
    }
}
/**
 * 5) Desafio: Área do círculo com base no raio;
 * Scanner: usado para leitura de entrada, no caso pede a área do círculo como entrada;
 * While: cria um loop para que a pergunta continue sendo impressa até digitar sair;
 * if-else: para as condições;
 * Try/Catch: para tratamento de exceção caso a entrada não seja válida, ou seja um número;
 * É usado a operação matemática Math.PI * radius * radius para realizar o cálculo da área do círculo;
 *
 * 13/04/2024
 */