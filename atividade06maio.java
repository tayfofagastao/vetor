package condicional;

import java.util.Scanner;

public class Atividade06Maio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[20];

        int j = 0;

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vet1[i] = input.nextInt();
            vet3[j] = vet1[i];
            j++;
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vet2[i] = input.nextInt();
            vet3[j] = vet2[i];
            j++;
        }

        System.out.println("Vetor resultante da intercalação:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vet3[i] + " ");
        }

        input.close();
    }
}
