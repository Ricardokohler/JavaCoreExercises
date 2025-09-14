package Nivel05_Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\n+-----------------------------------------------+");
        System.out.print("\n|------Programa para impressao de impares-------|");
        System.out.print("\n+-----------------------------------------------+");

        System.out.print("\n\nQuantos números serão digitados? ");
        int n = sc.nextInt();

        Double [] vect = new Double [n];
        Double sum = 0.0;

        for(int i=0; i<n; i++){
            System.out.print("Digite um numero: ");

            vect[i] = sc.nextDouble();
            sum += vect[i];

        }

        Double avg = sum / n;
        System.out.print("\nVALORES: ");
        for(int i=0; i<n; i++){
            System.out.print(vect[i] + " ");
        }

        System.out.print("\nSOMA: "+ sum + "\nMEDIA: " + avg);
        System.out.print("\n\nObrigado!\n");

        sc.close();

    }
}
