package cap_3;
import java.util.Scanner;

public class ex2 {
    public static void main(String[]args) {
        Scanner t =new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("---------------------------------");
        System.out.println("|       INVERÇÃO DE ARRAY       |");
        System.out.println("---------------------------------\n");

        for (int i = 0; i< num.length; i++) {
            System.out.print("Digite o numero na posição " + i + ": ");
            num[i] = t.nextInt();
        }

        System.out.print("\nA ordem correta dos digitos é essa: ");

        for (int i = 0; i < num.length; i++) {
            if ( i != num.length-1) {
                System.out.print(num[i] + ", ");
            } else {
                System.out.print(num[i]);
            }
        }

        for (int i = 0; i < num.length; i++) {
            num[i] = num.length-i;
        }

        System.out.print("\nA ordem invertida dos digitos é essa: ");

        for (int i = 0; i < num.length; i++) {
            if ( i != num.length-1) {
                System.out.print(num[i] + ", ");
            } else {
                System.out.print(num[i]);
            }
        }
    }
}
