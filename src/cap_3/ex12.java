package cap_3;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] array = new int[5];
        int rep = 0;
        int soma = 0;

        System.out.println("-----------------------------------------------");
        System.out.println("|       CONTADOR DE ELEMENTOS REPETIDOS       |");
        System.out.println("-----------------------------------------------\n");


        System.out.println("Digite os valores do Array 1: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Valor do Array 1 na posição " + i + ": ");
            array[i] = t.nextInt();
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n");

        System.out.print("Qual o valor que você quer encontrar no array: ");
        rep = t.nextInt();

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == rep) {
                soma++;
            }
        }

        System.out.println(soma);
    }
}