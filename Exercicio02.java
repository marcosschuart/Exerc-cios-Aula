import java.util.*;
public class Exercicio02 {
public static void main(String[] args) {

Scanner leia = new Scanner(System.in);

int num1, num2;

System.out.println("Digite um número: ");
num1 = leia.nextInt();

System.out.println("Digite outro número: ");
num2 = leia.nextInt();

int Resto = num1%num2;

System.out.printf("Resto:%d", Resto) ;
}
}
