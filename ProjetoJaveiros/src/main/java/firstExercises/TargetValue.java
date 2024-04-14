package firstExercises;

import java.util.Scanner;

public class TargetValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Por favor, digite o tamanho do array ou 'sair' para terminar:");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                int n = Integer.parseInt(userInput);
                int[] numbers = new int[n];
                System.out.println("Por favor, digite os números do array:");
                for (int i = 0; i < n; i++) {
                    numbers[i] = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Por favor, digite o valor alvo:");
                int target = Integer.parseInt(scanner.nextLine());

                int[] result = findTwoSum(numbers, target);
                if (result == null) {
                    System.out.println("Não existem dois números que somados resultam no valor alvo.");
                } else {
                    System.out.println("Os índices dos dois números que somados resultam no valor alvo são: " + result[0] + " e " + result[1]);
                }
            } catch (NumberFormatException e) {
                System.out.println("A entrada fornecida não é um número válido.");
            }
        }
    }

    public static int[] findTwoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
/**
 * 6) Desafio: Valor alvo;
 * Scanner: usado para leitura de entrada, no caso pede a área do círculo como entrada;
 * While: cria um loop para que a pergunta continue sendo impressa até digitar sair;
 * if-else: para as condições;
 * Try/Catch: para tratamento de exceção caso a entrada não seja válida, ou seja um número;
 * É usado a função findTwoSum que procura dois números no array que somados resultam no valor
 * alvo e retorna seus índices. Se não encontrar tais números, retorna null.
 *         for (int i = 0; i < numbers.length; i++) {
 *             for (int j = i + 1; j < numbers.length; j++) {
 *                 if (numbers[i] + numbers[j] == target) {
 *                     return new int[]{i, j};
 *                 }
 *             }
 *         }
 *         return null;
 *13/04/2024
 */