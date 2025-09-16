package Nivel01_Iniciante.Repetitivo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09_For {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\n+-------------------------------------------------------------------------+");
        System.out.print("\n|------------------Programa para divisão de 3 valores --------------------|");
        System.out.print("\n+-------------------------------------------------------------------------+\n");

        System.out.print("\nQuantas linhas serao digitadas? ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.print("\n" + i + " " + (i*i) + " " + (i*i*i));
        }

        System.out.print("\n\nObrigado!\n");

        sc.close();
    }
}
