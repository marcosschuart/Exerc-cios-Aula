//Nome:Marcos Schuart Nobre de Lima Palhares
//Matrícula:1261931350

import java.util.*;
public class Exercicio04 {
public static void main(String[] args) {

Scanner leia = new Scanner(System.in);

double salario;

System.out.println("Digite o salário atual: ");
salario = leia.nextDouble();

System.out.printf("Salário Atual: R$%.2f\n", salario);

double novoSalario = salario * 1.07;
System.out.printf("Novo Salário: R$%.2f", novoSalario);

}
}
