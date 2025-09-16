package Nivel05_Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\n+---------------------------------------+");
        System.out.print("\n|------ Programa média de vetores ------|");
        System.out.print("\n+---------------------------------------+");

        System.out.print("\n\nQuantos elementos terá o vetor? ");
        int n = sc.nextInt();

        Double [] nums = new Double[n];
        Double count = 0.0;

        System.out.println();

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");

            nums[i] = sc.nextDouble();
            count += nums[i];
        }

        Double avg = count / n;
        System.out.print("\nMedia: " + avg);

        System.out.print("\n\nAbaixo da media: ");
        for(int i=0; i<n; i++){
            if(nums[i] < avg ){
                System.out.print("\n" + nums[i]);
            }
        }

        System.out.print("\nObrigado!\n");
        sc.close();
    }
}
