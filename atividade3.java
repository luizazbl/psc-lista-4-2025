String nome, sexo, estadoCivil;
int idade;
double salario;
while (true) {
System.out print(s:"Digite seu nome: ");
nome = scanner.nextLine();
if (nome. length() > 3) {
break;
System.out-println(x: "Erro.");
}
while (true) {
System.out print(s: "Digite sua idade: ");
idade = scanner.nextInt();
if (idade >= 0 && idade <= 150) {
break;
System.out.println(x:"Erro.");

scanner. nextLine();
while (true) {
System. out prints: "Digite seu sexo: ");
sexo = scanner.nextLine( ).toLowerCase();
if (sexo.equals(anObject:"f") || sexo.equals(anObject: "m" )) {
break;
}
System.out printin(x: "Erro!");
while (true) {
System.out print(s:"Digite seu estado civil");

estadoCivil = scanner.nextLine(). toLowerCase();
if (estadoCivil equals(anObject:"s") || estadoCivil.equals(anObject:"") || estadoCivil.
equals (anObject: "v") || estadoCivil. equals (anObject: "d")) {
break;
}
System.out.println(x:"Erro");
System.out.println("Nome:" + nome) ;
System.out.println("Idade: " + idade);
System.out.println("Salário: R$" + salario);
System.out.println("Estado Civil: " + estadoCivil. toUpperCase()) ;
System.out. println("Sexo: " + (sexo.equals(anObject:"f) ? "Feminino" : "Masculino"));
