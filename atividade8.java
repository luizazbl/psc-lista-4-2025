package
lu;
 import java.util.Scanner;
import java.util.Random;

public class maiort
Run | Debug
public static void main(String[]
args){
Scanner leia
= new Scanner (System. in);
Random random = new Random); int
soma=0;
int quantidadeNumeros = 5;
for (int i = 0; i ‹ quantidadeNumeros; i++) (
System. out-print(s:"Digite um número: ");
int numero = leia.nextInt();
soma += numero;
double media = (double) soma / quantidadeNumeros;
System.out-println("0 resultado foi: " + soma);
System.out.println("A média dos números é: " +
media；
leia.close();
