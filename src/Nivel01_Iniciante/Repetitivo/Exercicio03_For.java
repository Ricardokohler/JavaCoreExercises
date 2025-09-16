package Nivel01_Iniciante.Repetitivo;


import java.util.Scanner;

public class Exercicio03_For {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n+-----------------------------------------------------------------------+");
        System.out.print("\n|--------------Programa para impressão de numero primos-----------------|");
        System.out.print("\n+-----------------------------------------------------------------------+\n");

        System.out.print("\nDigite um numero: ");
        int n = sc.nextInt();

        System.out.print("\nÍmpares: ");
        for (int i = 0; i <= n; i++){
            if(i % 2 != 0) {
                System.out.print("\n" + i);
            }
        }

        System.out.print("\n\nObrigado!\n");

        sc.close();
    }
}
