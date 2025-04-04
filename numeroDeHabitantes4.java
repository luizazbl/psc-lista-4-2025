package lu;
import java.util.Scanner;
public class numerodehabitantes4{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int populacaoA = 80000, populacaoB = 200000,anos = 0;

    double taxaCrescimentoA = 0.03,taxaCrescimentoB = 0.015;

    while (populacaoA <= populacaoB) {
        populacaoA += populacaoA * taxaCrescimentoA;
        populacaoB += populacaoB * taxaCrescimentoB;
        anos++;
        System.out.println("Número de anos necessários: " + anos);
        scanner.close();
    }
}
}
