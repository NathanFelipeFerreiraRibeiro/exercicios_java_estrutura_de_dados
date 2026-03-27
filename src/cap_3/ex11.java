package cap_3;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[5];

        System.out.println("------------------------------");
        System.out.println("|       SOMA DE ARRAYS       |");
        System.out.println("------------------------------\n");


        System.out.println("Digite os valores do Array 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Valor do Array 1 na posição " + i + ": ");
            array1[i] = t.nextInt();
        }

        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\n");

        System.out.println("Digite os valores do Array 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Valor do Array 2 na posição " + i + ": ");
            array2[i] = t.nextInt();
        }

        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}