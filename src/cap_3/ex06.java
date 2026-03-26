package cap_3;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] num = new int[5];
        int[] num2 = new int [3];

        System.out.println("---------------------------------------");
        System.out.println("|       VALORES ÍMPARES E PARES       |");
        System.out.println("---------------------------------------\n");


        System.out.println("Digite os valores do Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Valor na posição " + i + ": ");
            num[i] = t.nextInt();
        }

        System.out.print("\nO Array com seus valores atuais: ");

        for (int i = 0; i < num.length; i++) {
            if (i < num.length - 1) {
                System.out.print(num[i] + ", ");
            } else {
                System.out.print(num[i] + ". ");
            }
        }

        System.out.print("\n\nO Array sem o primeiro e o último número: ");

        for (int i = 0; i < num2.length; i++) {
            num2[i] = num[i+1];

            if (i < 2) {
                System.out.print(num2[i] + ", ");
            } else {
                System.out.print(num2[i] + ". ");
            }
        }
    }
}