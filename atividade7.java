package
lu;
import java.util.Scanner;
import java.util.Random;
public class maiort
Run | Debug
public static void main(String[]
args) {
Scanner leia
= new
Scanner (System. in);
Random random = new Random);
int
maior = 0;
int
contador = 0;
while (contador < 5) €
System.out.print(s:"Digite um número: ");
int numero = leia.nextInt();

if (numero › maior) {
maior = numero;

contador++;
System.out println("0 maior número digitado foi: " + maior);
leia.close();
