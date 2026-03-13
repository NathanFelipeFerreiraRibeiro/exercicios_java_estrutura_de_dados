package cap_3;
import java.util.Scanner;

public class ex3 {
    public static void main(String[]args) {
        Scanner t = new Scanner(System.in);
        int[] num = new int[5];
        int soma = 0;

        System.out.println("-------------------------------------------");
        System.out.println("|       SOMA DE VALORES DE UM ARRAY       |");
        System.out.println("-------------------------------------------\n");

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite o numero na posição " + i + ": ");
            num[i] = t.nextInt();
        }

        System.out.print("\nO array contem os digitos: ");

        for (int i = 0; i < num.length; i++) {
            if (i != num.length-1) {
                System.out.print(num[i] + ", ");
            } else {
                System.out.println(num[i]);
            }
        }

        System.out.print("\nSomados eles dão o valor: ");

        for (int i = 0; i < num.length; i++) {
            soma += num[i];
        }

        System.out.print(soma);
    }
}
