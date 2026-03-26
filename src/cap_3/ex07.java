package cap_3;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[][] num = new int[3][3];
        int i,j;

        System.out.println("---------------------------------------");
        System.out.println("|       VALORES ÍMPARES E PARES       |");
        System.out.println("---------------------------------------\n");


        System.out.println("Digite os valores do Array: ");

        for (i = 0; i < num.length; i++) {
            for(j = 0;j < num.length; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                num[i][j] = t.nextInt();
            }
        }

        for (i = 0; i < num.length; i++) {
        System.out.print("\n");
            for(j = 0;j < num.length; j++) {
                if(i <= 0) {
                    System.out.print(num[i][j] + " ");
                } else if (i == 1) {
                    System.out.print(num[i][j] + " ");
                } else {
                    System.out.print(num[i][j] + " ");
                }
            }
        }
    }
}