package Nivel04_Avancado_For;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\n+-------------------------------------------------------------------------+");
        System.out.print("\n|------------------Programa para divisão de 3 valores --------------------|");
        System.out.print("\n+-------------------------------------------------------------------------+");

        System.out.print("\n\nQuantas contas serao feitas? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("\nOperação #" + (i+1) + ": ");
            System.out.print("\nValores: ");

            System.out.print("\n#1: ");
            double c1 = sc.nextInt();
            System.out.print("#2: ");
            double c2 = sc.nextInt();

            if(c2 == 0){
                System.out.print("Divisão impossível\n");
            } else {
                System.out.print("Divisão: " + c1/c2 + "\n");
            }
        }

        System.out.print("\nobrigado!\n");

        sc.close();
    }
}
