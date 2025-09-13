package Nivel04_Avancado_For;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\n+-------------------------------------------------------------------------+");
        System.out.print("\n|------------------Programa para calculo fatorial de n -------------------|");
        System.out.print("\n+-------------------------------------------------------------------------+");

        System.out.print("\n\nDigite o valor de n ");
        int n = sc.nextInt();
        int fat = n;

        if(n != 0){
            for(int i = 1; i < n; i++){
                fat *= (n-i);
            }

        } else {
            fat = 1;
        }

        System.out.print("Fatorial: " + fat);
        System.out.print("\n\nObrigado!\n");

        sc.close();
    }
}
