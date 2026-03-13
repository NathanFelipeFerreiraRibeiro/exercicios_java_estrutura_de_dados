package cap_3;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] num = new int[5];
        int soma = 0;

        System.out.println("--------------------------------------------");
        System.out.println("|       SOMA DOS VALORES DE UM ARRAY       |");
        System.out.println("--------------------------------------------\n");

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite o numero na posição " + i + ": ");
            num[i] = t.nextInt();
        }

        System.out.print("\nA ordem correta dos digitos é essa: ");

        for (int i = 0; i < num.length; i++) {
            if (i != num.length - 1) {
                System.out.print(num[i] + ", ");
            } else {
                System.out.print(num[i]);
            }
        }

        for (int i = 0; i < num.length; i++) {
            soma += num[i];
        }

        System.out.print("\nA soma dos valores desse array é: " + soma);
    }
}