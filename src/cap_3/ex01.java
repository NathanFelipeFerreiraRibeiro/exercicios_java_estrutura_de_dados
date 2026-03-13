package cap_3;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner t =  new Scanner(System.in);
        int[] mes = new int[5];
        int menor = 0;
        int maior = 0;

        System.out.println("-----------------------------");
        System.out.println("|       MAIOR E MENOR       |");
        System.out.println("-----------------------------\n");

        for (int i = 0;i<mes.length;i++) {
            System.out.print("Digite um valor para a posição " + i + ": ");
            mes[i] = t.nextInt();

            if (i == 0) {
                menor = mes[i];
                maior = mes[i];
            } else {
                if (menor > mes[i]) {
                    menor = mes[i];
                }

                if (maior < mes[i]) {
                    maior = mes[i];
                }
            }
        }
            System.out.println("\nMaior: " + maior);
            System.out.println("Menor: " + menor);
    }
}
