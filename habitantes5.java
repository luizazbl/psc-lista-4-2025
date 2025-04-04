package lu;

import java.util.Scanner;

public class habitantes5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
         
            System.out.print("Informe a população inicial do país A: ");
            int populacaoA = lerPopulacao(scanner);

            System.out.print("Informe a taxa de crescimento anual do país A (em %): ");
            double taxaCrescimentoA = lerTaxaCrescimento(scanner);

            System.out.print("Informe a população inicial do país B: ");
            int populacaoB = lerPopulacao(scanner);

            System.out.print("Informe a taxa de crescimento anual do país B (em %): ");
            double taxaCrescimentoB = lerTaxaCrescimento(scanner);

       
            int anos = 0;

            while (populacaoA <= populacaoB) {
                populacaoA += populacaoA * taxaCrescimentoA;
                populacaoB += populacaoB * taxaCrescimentoB;
                anos++;
            }

        
            System.out.println("Número de anos necessários: " + anos);

     
            System.out.print("Deseja realizar outra operação?: ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        scanner.close();
    }

    private static double lerTaxaCrescimento(Scanner scanner) {
       
        throw new UnsupportedOperationException("Unimplemented method 'lerTaxaCrescimento'");
    }

    private static int lerPopulacao(Scanner scanner) {
        int populacao;
        while (true) {
            if (scanner.hasNextInt()) {
                populacao = scanner.nextInt();
                if (populacao > 0) {
                    return populacao;
                } else {
                    System.out.print("Por favor, insira um número positivo para a população: ");
                }
            } else {
                System.out.print("Entrada inválida. Por favor, insira um número válido para a população: ");
                scanner.next(); 
            }
        }
    }
}
