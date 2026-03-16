//Nome:Marcos Schuart Nobre de Lima Palhares
//Matrícula:1261931350

import java.util.*;
public class Exercicio03 {
public static void main(String[] args) {

Scanner leia = new Scanner(System.in);
double dolar;
final double COTACAO = 4.95;

System.out.println("Digite o valor em dólar: ");
dolar = leia.nextDouble();

System.out.printf("Valor Convertido: R$%.2f", dolar*COTACAO);
}
}
