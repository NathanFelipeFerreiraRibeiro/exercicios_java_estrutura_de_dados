package cap_3;
import java.util.Scanner;
import java.util.Arrays;

public class ex13 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("------------------------------------------");
        System.out.println("|       DOBRAR OS VALORES DO ARRAY       |");
        System.out.println("------------------------------------------\n");

        System.out.println("Digite os valores do Array 1: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Valor do Array 1 na posição " + i + ": ");
            array[i] = t.nextInt();
        }

        System.out.print("\nOs valores do array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int[] resultado = Arrays.stream(array).map(n -> n * 2).toArray();

        System.out.print("\n\nOs valores dobrados do array fica: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
            System.out.print(array[i] + " ");
        }


        System.out.print("\nAqui está o array dobrado com a API de Streams: " + Arrays.toString(resultado));
    }
}