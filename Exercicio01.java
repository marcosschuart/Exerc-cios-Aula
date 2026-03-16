//Nome:Marcos Schuart Nobre de Lima Palhares
//Matrícula:1261931350

import java.util.*;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite um número: ");
        num1 = leia.nextDouble();

        System.out.println("Digite outro número: ");
        num2 = leia.nextDouble();

        double Adicao = num1+num2;

        System.out.printf("Adição: %.2f\n", Adicao);
        
        double Subtracao = num1-num2;

        System.out.printf("Subtração: %.2f\n", Subtracao);

        double Multiplicacao = num1*num2;

        System.out.printf("Multiplicação: %.2f\n", Multiplicacao);

        double Divisao = num1/num2;

        System.out.printf("Divisão: %.2f\n", Divisao);

    }
}
