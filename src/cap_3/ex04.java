package cap_3;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] num = new int[5];
        int par = 0;
        int impar = 0;

        System.out.println("---------------------------------------");
        System.out.println("|       VALORES ÍMPARES E PARES       |");
        System.out.println("---------------------------------------\n");


        System.out.println("Digite os valores do Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Valor na posição " + i + ": ");
            num[i] = t.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.print("\nValores no Array: ");

        for (int i = 0; i < num.length; i++) {
            if (i == num.length - 1) {
                System.out.print(num[i]);
            } else {
                System.out.print(num[i] + ", ");
            }
        }

        System.out.println("\n\nValores Pares: " + par);
        System.out.println("Valores Ímpares: " + impar);
    }
}
