package Nivel01_Iniciante.Repetitivo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08_For {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\n+-------------------------------------------------------------------------+");
        System.out.print("\n|------------------Programa para divisão de 3 valores --------------------|");
        System.out.print("\n+-------------------------------------------------------------------------+\n\n");

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        System.out.print("\nDivisores:\n");

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.print(i + "\n");
            }
        }

        System.out.print("\nObrigado!\n");

        sc.close();
    }
}
