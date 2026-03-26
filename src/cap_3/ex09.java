package cap_3;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[][] num = new int[3][3];
        int i,j, valor = 0;
        char resp;

        System.out.println("-----------------------------------------------");
        System.out.println("|       ALTERAR VALOR DO ITEM NA MATRIZ       |");
        System.out.println("-----------------------------------------------\n");


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
                    System.out.print("\t" + num[i][j] + " ");
                } else if (i == 1) {
                    System.out.print("\t" + num[i][j] + " ");
                } else {
                    System.out.print("\t" + num[i][j] + " ");
                }
            }
        }

        do {
            System.out.print("\n\nQuer alterar algum valor da Matriz? [S/N]: ");
            resp = t.next().charAt(0);

            if((resp == 'S' && resp == 's') && (resp == 'N' && resp == 'n')) {
                System.out.println("\nOpção invalida! Por favor digite um valor valido!\n");
            }
        } while ((resp != 'S' && resp != 's') && (resp != 'N' && resp != 'n'));

        if (resp == 'S' || resp == 's') {
            System.out.print("digite a linha: ");
            i = t.nextInt();
            System.out.print("digite a coluna: ");
            j = t.nextInt();
            System.out.print("digite o valor: ");
            valor = t.nextInt();

            AddNumber(num, i, j, valor);

            for (i = 0; i < num.length; i++) {
                System.out.print("\n");
                for(j = 0;j < num.length; j++) {
                    if(i <= 0) {
                        System.out.print("\t" + num[i][j] + " ");
                    } else if (i == 1) {
                        System.out.print("\t" + num[i][j] + " ");
                    } else {
                        System.out.print("\t" + num[i][j] + " ");
                    }
                }
            }
        }
    }

    public static int AddNumber (int [][] num, int i, int j, int valor) {
        num[i][j] = valor;
        return num[i][j];
    }
}