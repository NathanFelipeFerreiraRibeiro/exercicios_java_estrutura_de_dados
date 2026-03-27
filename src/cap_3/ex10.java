package cap_3;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] array = new int[5];
        int num;

        System.out.println("----------------------------------------");
        System.out.println("|       ENCONTRAR VALOR NO ARRAY       |");
        System.out.println("----------------------------------------\n");


        System.out.println("Digite os valores do Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Valor do Array na posição " + i + ": ");
            array[i] = t.nextInt();
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.print("\nVeja se um número existe no Array: ");
        num = t.nextInt();

        localizacao(array, num);

    }

    public static void localizacao(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == num) {
                System.out.print("\nO número se encontra na posição [" + i + "] do Array.");
                return;
            } else if(i == array.length-1) {
                System.out.print("\n-1");
                return;
            }
        }
    }
}