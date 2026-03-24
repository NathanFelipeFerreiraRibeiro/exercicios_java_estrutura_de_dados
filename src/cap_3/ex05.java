package cap_3;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] num = new int[5];
        int[] num2 = new int[6];
        int axl = 0;

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

        System.out.print("\n\nDigite o novo número que irá para o primeiro lugar do Array: ");
        num2[0] = t.nextInt();

        for(int i = 0; i < num.length; i++) {
            num2[i+1] = num[i];
        }

        System.out.print("\nArray com novo número na primeira posição: ");

        for (int i = 0; i < num2.length; i++) {
            if (i < num2.length - 1) {
                System.out.print(num2[i] + ", ");
            } else {
                System.out.print(num2[i] + ".");
            }
        }

        System.out.println("\n\nArray com novo número na última posição: ");

        axl = num2[0];

        for(int i = 0; i < num2.length - 1; i++) {
            num2[i] = num2[i+1];
        }

        num2[num2.length - 1] = axl;

        for (int i = 0; i < num2.length; i++) {
            if (i < num2.length-1) {
                System.out.print(num2[i] + ", ");
            } else {
                System.out.print(num2[i] + ". ");
            }
        }
    }
}
